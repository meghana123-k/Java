
class PrintEven implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i+=2) {
            System.out.println("Even "+i);
        }
    }
}
class PrintOdd implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i+=2) {
            System.out.println("Odd "+i);
        }
    }
}
public class PrintEvenOddThread {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new PrintEven());
        evenThread.start();
        Thread oddThread = new Thread(new PrintOdd());

        try {
            evenThread.join();
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
        oddThread.start();
    }
}