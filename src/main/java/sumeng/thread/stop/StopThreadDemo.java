package sumeng.thread.stop;

/**
 * Created by sumengzhang on 4/11/21 10:10 PM
 *
 *  run中没有sleep或者wait方式时，停止线程
 */
public class StopThreadDemo  implements Runnable{
    @Override
    public void run() {
        int num = 0;
        while(!Thread.currentThread().isInterrupted()&&num<=Integer.MAX_VALUE/2){
            if(num%10000==0){
                System.out.println(num+"is times of 10000");
            }
            num++;

        }
        System.out.println("end game");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new StopThreadDemo());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();


    }
}
