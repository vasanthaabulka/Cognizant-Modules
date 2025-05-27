public class ThreadExample extends Thread {
    private String message;
    public ThreadExample(String message) {
        this.message = message;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample("Thread 1");
        ThreadExample thread2 = new ThreadExample("Thread 2");
        thread1.start();
        thread2.start();
    }
}