package IO;

import java.awt.*;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;   // new io
import java.nio.channels.SocketChannel;
import java.util.LinkedList;
/*
    弊端：
        重复系统调用 空跑， 没有连接，没有数据还是会调用
        accept()
        read()


 */
public class SocketNIO {
    public static void main(String[] args) throws Exception{
        LinkedList<SocketChannel> clients = new LinkedList<>();
        ServerSocketChannel ss = ServerSocketChannel.open();   // listen
        ss.bind(new InetSocketAddress(9090));
        ss.configureBlocking(false);       // Non blocking

        while(true){
            Thread.sleep(1000);
            SocketChannel client = ss.accept();   // Non block
            if(client == null){
                // no client connect
                // System.out.println("No connect.....");
            }
            else{
                client.configureBlocking(false);
                int port = client.socket().getPort();
                System.out.println("client .. port "+ port);
                clients.add(client);
            }
            ByteBuffer buffer  = ByteBuffer.allocateDirect(4096);
            for(SocketChannel c: clients){
                int num = c.read(buffer);        // > 0, 0, -1   // 不会阻塞
                if(num > 0){
                    buffer.flip();
                    byte[] aaa = new byte[buffer.limit()];
                    buffer.get(aaa);
                }
            }
        }
    }
}


/*
    Usage:
    用 jdk1.8 来演示
    javac SocketBIO.java

    strace -ff -o out java SocketBIO.class
 */

/*
    分析trace 文件
    strace 会生成一系列 out.xxxx 文件，xxxx为线程号， 第一个线程为主线程, 对于jdk1.8，第二个线程为主线程

    vi out.xxxx

    :set nu               # show line number in vi

    /9090                 # search 9090


    可以发现 系统调用
    fcntl(4, F_SETFL, O_RDWR|O_NONBLOCK) = 0
    accept(4, 0xXXXXXXXXXX, [28])      = -1     // NON Block

 */


/* -- 分析 java 程序的网络使用
    jps                  # 列出本机所有java进程的pid

    netstat -natp        # 可以看到server的主线程的网络状态


    nc localhost 9090    # 连接server


    vi +<linenumber>     # 从指定行号的行开始显示文本内容
 */