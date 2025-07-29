class Fruit {
    String name;
    String taste;
    int size;
    Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    void eat() {
        System.out.println("This is a " + name + " and it tastes " + taste);
    }
}

class Apple extends Fruit {
    Apple(String name, String taste, int size) {
        super(name, taste, size);
    }
    void eat() {
        System.out.println("Apple taste: " + taste);
    }
    
}
class Orange extends Fruit{
    Orange(String name, String taste, int size) {
        super(name, taste, size);
    }

    void eat() {
        System.out.println("Orange taste: " + taste);
    }
}

class OverRiding1 {
    public static void main(String[] args) {
        Fruit f1 = new Apple("Apple", "Sweet", 5);
        f1.eat();
        Fruit f2 = new Orange("Orange", "Sweet & Sour", 7);
        f2.eat();
    }
}