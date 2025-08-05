import java.util.Random;
class RandomClass implements Runnable {
    @Override
    public void run() {
        String[] colors = {"white", "blue", "black", "green", "red", "yellow"};
        Random random = new Random();
        int index = -1;
        while (index != 4) {
            index = random.nextInt(6);
            System.out.println(Thread.currentThread().getName()+" Random Color: "+colors[index]);
        }
        System.out.println(colors[index]+" = "+"Stop");
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
