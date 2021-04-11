package sumeng.thread.implement;

/**
 *  run 被重写了所以不会执行 Runnable target  的  target.run()
 * Created by sumengzhang on 4/7/21 11:47 PM
 */
public class Both {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 线程");
            }
        }){
            @Override
            public void run() {
                System.out.println("Thread 线程");
            }
        }.start();

    }
}
