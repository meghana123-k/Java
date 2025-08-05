
class MAX implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
        System.out.println("MAX Thread");
    }
}
class MIN implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
        System.out.println("MIN Thread");
    }
}
class NORM implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
        System.out.println("NORM Thread");
    }
}
public class PrioritiesThread {
    public static void main(String[] args) {
        Thread maxThread = new Thread(new MAX());
        Thread minThread = new Thread(new MIN());
        Thread normThread = new Thread(new NORM());

        maxThread.setPriority(Thread.MAX_PRIORITY);
        minThread.setPriority(Thread.MIN_PRIORITY);
        normThread.setPriority(Thread.NORM_PRIORITY);

        maxThread.start();
        minThread.start();
        normThread.start();
    }
}
