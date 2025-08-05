class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am " + Thread.currentThread().getName());
        }
    }
}
class MyThreadImplements2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread1());
        t1.setName("Scooby");
        t1.start();
        Thread t2 = new Thread(new MyThread1());
        t2.setName("Shaggy");
        t2.start();

    }
}
