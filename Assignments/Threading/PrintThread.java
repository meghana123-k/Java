
class PrintNum implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if(i == 6) {
                try {
                    Thread.sleep(5000);
                } catch(InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
            System.out.println("i = "+i);
        }
    }
}
public class PrintThread {
    public static void main(String[] args) {
        Thread th = new Thread(new PrintNum());
        th.start();
    }
}
