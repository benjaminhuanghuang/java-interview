package trick;

class ThreadDemo implements Runnable {
    private  Thread t;
    private String threadName;

    ThreadDemo(String threadName){
        this.threadName = threadName;
    }

    public void run(){
        while (true){
            System.out.println(threadName);
        }
    }

    public void start(){
        if(t== null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}


public class TestThread{
    public static void main(String args[]){
         ThreadDemo A = new ThreadDemo("A");
         ThreadDemo B = new ThreadDemo("B");

         B.start();
         A.start();
    }

}