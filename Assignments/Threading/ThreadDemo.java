class MyThread extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am "+getName());
        }
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.setName("Scooby");
        mt1.start();
        MyThread mt2 = new MyThread();
        mt2.setName("Shaggy");
        mt2.start();
    }    
}