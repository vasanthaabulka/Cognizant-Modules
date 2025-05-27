```java
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            Callable<Integer> task = () -> {
                Thread.sleep(100);
                return taskId * 10;
            };
            futures.add(executor.submit(task));
        }

        for (Future<Integer> future : futures) {
            try {
                System.out.println("Task result: " + future.get());
            } catch (Exception e) {
                System.out.println("Executor error: " + e.getMessage());
            }
        }

        executor.shutdown();
    }
}
```