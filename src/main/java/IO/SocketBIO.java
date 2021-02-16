package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/*
    BIO 相关的 系统调用
    socket =3    // create
    bind ( 3, 9090)
    listen(3)

    accept(3)    // block then return 5

    clone()      // create a thread

    receive(5)   // read the stream

    man 2 socket        // 系统调用的文档
 */
public class SocketBIO {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9090, 20);
        System.out.println("Step1: new ServerSocket(9090");


        while (true) {
            Socket client = server.accept(); // 阻塞
            System.out.println("Step2: client\t" + client.getPort());

            // BIO，每个连接都对应一个线程
            new Thread(new Runnable() {
                @Override
                public void run() {
                    InputStream in = null;
                    try {
                        in = client.getInputStream();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                        while (true) {
                            String dataline = reader.readLine();  // 阻塞 receive()
                            if (null != dataline) {
                                System.out.println(dataline);
                            } else {
                                client.close();
                                break;
                            }
                        }
                        System.out.println("Client was disconnected");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}


/*
    Usage:
    /usr/java.j2sdk1.4.2_19/bin/javac SocketBIO.java

    strace -ff -o out /usr/java.j2sdk1.4.2_19/bin/java SocketBIO.class

    在Linux世界，进程不能直接访问硬件设备，当进程需要访问硬件设备(比如读取磁盘文件，
    接收网络数据等等)时，必须由用户态模式切换至内核态模式，通过系统调用访问硬件设备。

    strace可以跟踪到一个进程产生的系统调用,包括参数，返回值，执行消耗的时间。
    -f 跟踪由fork调用所产生的子进程.
    -ff: 与 -o <filename> 一起使用，会把每个 pid (进程 pid 或线程 id) 的 strace 数据保存到 <filename>.<pid> 的文件中。

    -o filename
    将strace的输出写入文件filename

    -p pid
    跟踪指定的进程pid.

    -e trace=file
    只跟踪有关文件操作的系统调用.
    -e trace=process
    只跟踪有关进程控制的系统调用.
    -e trace=network
    跟踪与网络有关的所有系统调用.
    -e strace=signal
    跟踪所有与系统信号有关的 系统调用
    -e trace=ipc
    跟踪所有与进程通讯有关的系统调用
 */

/*
    分析trace 文件
    strace 会生成一系列 out.xxxx 文件，xxxx为线程号， 第一个线程为主线程

    vi out.xxxx

    :set nu               # show line number in vi

    /9090                 # search 9090

 */


/* -- 分析 java 程序的网络使用
    jps                  # 列出本机所有java进程的pid

    netstat -natp        # 可以看到server的主线程的网络状态


    nc localhost 9090    # 连接server


    vi +<linenumber>     # 从指定行号的行开始显示文本内容
 */