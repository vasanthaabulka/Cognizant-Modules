```java
public class VirtualThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 100_000; i++) {
            int threadId = i;
            Thread.startVirtualThread(() -> {
                System.out.println("Virtual Thread " + threadId + " running");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        System.out.println("Started 100,000 virtual threads");
        try {
            Thread.sleep(2000); // Wait for threads to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```