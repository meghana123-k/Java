
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
    void erase() {
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
    void erase() {
        System.out.println("Erasing Circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
    void erase() {
        System.out.println("Erasing Rectangle");
    }
}

class OverRiding2 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        s.erase();
        Shape c = new Circle();
        c.draw();
        c.erase();
        Shape r = new Rectangle();
        r.draw();
        r.erase();
    }
}
