interface Computer {
    void code();
}
class Laptop implements Computer {
    public void code() {
        System.out.println("Code compile and Run");
    }
}
class Desktop implements Computer {
    public void code() {
        System.out.println("Code compile and Run: Faster");
    }
}
class Developer {

    public void devApp(Computer lp) {
        lp.code();
    }
}

class InterfacePractice {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        
        Developer meghana = new Developer();
        meghana.devApp(lap);
        meghana.devApp(desk);
    }
}