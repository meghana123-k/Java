class Animal {
    void eat() {
        System.out.println("Eat method in Animal Class");
    }

    void sleep() {
        System.out.println("Sleep method in Animal Class");
    }
}

class Bird extends Animal {
    void eat() {
        System.out.println("Eat method in Bird Class");
    }

    void sleep() {
        System.out.println("Sleep method in Bird Class");
    }

    void fly() {
        System.out.println("fly method in Bird Class");
    }
}

class AnimalsDemo {
    public static void main(String... args) {
        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();
        Bird b1 = new Bird();
        b1.eat();
        b1.sleep();
        b1.fly();
    }
}