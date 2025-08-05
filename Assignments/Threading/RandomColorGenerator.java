import java.util.Random;
class RandomClass implements Runnable {
    @Override
    public void run() {
        String[] colors = {"white", "blue", "black", "green", "red", "yellow"};
        Random random = new Random();
        while (true) {
            int index = random.nextInt(6);
            if(colors[index].equalsIgnoreCase("red")) {
                System.out.println(Thread.currentThread().getName()+" "+colors[index]+" = "+"Stop");
                System.exit(0);
            }
            System.out.println(Thread.currentThread().getName()+" Random Color: "+colors[index]);
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class RandomColorGenerator {
    public static void main(String[] args) {
        Thread th1 = new Thread(new RandomClass());
        th1.start();
        Thread th2 = new Thread(new RandomClass());
        th2.start();
        
    }
}
