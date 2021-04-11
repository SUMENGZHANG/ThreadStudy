package sumeng.thread.implement;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by sumengzhang on 4/10/21 10:41 PM
 */
public class CallTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "hello";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new CallTask());
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
