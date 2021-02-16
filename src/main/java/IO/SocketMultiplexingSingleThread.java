package IO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.security.spec.ECField;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.InflaterOutputStream;

/*
 man 2 select   得到 select 系统调用 文档


 */
public class SocketMultiplexingSingleThread {
    private ServerSocketChannel server = null;
    private Selector selector = null;

    int port = 9090;

    public void initServer() {
        try {
            server = ServerSocketChannel.open();
            server.configureBlocking(false);
            server.bind(new InetSocketAddress(port));

            selector = Selector.open();

            server.register(selector, SelectionKey.OP_ACCEPT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        initServer();
        System.out.println("Serer is started");
        try {
            while (true) {
                Set<SelectionKey> keys = selector.keys();
                System.out.println(keys.size() + "  size");

                while( selector.select() > 0){  // has event
                    Set<SelectionKey> selectionKeys = selector.selectedKeys();
                    Iterator<SelectionKey> iter = selectionKeys.iterator();

                    while(iter.hasNext()){
                        SelectionKey key = iter.next();
                        iter.remove();
                        if(key.isAcceptable()){
                            acceptHandler(key);
                        }
                        else if(key.isReadable()){
                            readHandler(key);
                        }
                    }
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void acceptHandler(SelectionKey key){
        try{
            ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
            SocketChannel client = ssc.accept();
            client.configureBlocking(false);
            ByteBuffer buffer = ByteBuffer.allocate(8192);

            client.register(selector, SelectionKey.OP_READ, buffer);
            System.out.println("New client " + client.getRemoteAddress());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void readHandler(SelectionKey key){
        try{
            ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
            SocketChannel client = ssc.accept();
            client.configureBlocking(false);


        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
