class ThreadClass implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am " + Thread.currentThread().getName());
        }
    }
}
class Thread2 extends ThreadClass {
    void printThreadClass() {
        super.run();
    }
}

class MyThreadImplements {
    public static void main(String[] args) {
        Thread2 th = new Thread2();
        th.printThreadClass();
    }
}
