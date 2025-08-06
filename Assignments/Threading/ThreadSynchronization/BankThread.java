class Account {
    
    int balance = 1000;
    public void withDraw(int amount) {
        balance -= amount;
        System.out.println(Thread.currentThread().getName()+" Remaining Balance = "+balance);
    }
}
class CheckThread implements Runnable {
    Account a;
    CheckThread(Account obj) {
        a = obj;
    }
    @Override
    public void run() {
        a.withDraw(500);
    }
}
class BankThread {
    public static void main(String[] args) {
        Account a1 = new Account();
        Thread t1 = new Thread(new CheckThread(a1), "Thread1");
        Thread t2 = new Thread(new CheckThread(a1), "Thread2");
        t1.start();
        t2.start();

    }
}
