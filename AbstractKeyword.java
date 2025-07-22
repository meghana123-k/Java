abstract class Car {
    public abstract void drive();
    public void playMusic() {
        System.out.println("Play Music...");
    }
    
}
class BMW extends Car {
    public void drive() {
        System.out.println("Driving...");
    }
    
    public void playMusic() {
        System.out.println("Hello Rammantey.. vachesthunna...");
    }
    public void sit() {
        System.out.println("Four seating");
    }
    
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Car c = new BMW();
        c.drive();
        c.playMusic();
        // c.sit();
    }
}
