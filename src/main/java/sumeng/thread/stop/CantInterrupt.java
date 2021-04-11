package sumeng.thread.stop;

/**
 * Created by sumengzhang on 4/11/21 10:38 PM
 *
 * 中断失效，while try/catch的问题
 *  sleep后会把interrupt标记位清除
 */
public class CantInterrupt{
    public static void main(String[] args) throws InterruptedException {
            Runnable runnable = ()->{
                int num = 0;
                while(num<=10000&&!Thread.currentThread().isInterrupted()){
                    if(num%100==0){
                        System.out.println(num+"is times of 100");
                    }
                    num++;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        };
            Thread thread = new Thread(runnable);
            thread.start();
            thread.sleep(1000);
            thread.interrupt();
    }
}
