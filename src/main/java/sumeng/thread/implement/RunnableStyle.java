package sumeng.thread.implement;

/**
 * Created by sumengzhang on 4/7/21 11:28 PM
 * 用runnable接口创建线程
 */
public class RunnableStyle implements Runnable{
    @Override
    public void run() {
        System.out.println("使用Runnable接口实现线程");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }
}
