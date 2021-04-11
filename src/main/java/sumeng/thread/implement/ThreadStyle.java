package sumeng.thread.implement;

/**
 *  进程 Thread 类， 重写run方法
 * Created by sumengzhang on 4/7/21 11:31 PM
 */
public class ThreadStyle extends Thread {
    @Override
    public void run() {
        System.out.println("用thread类实现线程");
    }

    public static void main(String[] args) {
         new ThreadStyle().start();
    }
}
