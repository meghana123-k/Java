class Outer{

    void outerMethod() {
        System.out.println("Outer Method...");
    }
    class Inner {
        void innerMethod() {
            System.out.println("Inner Method...");
        }
        
    }
}

class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerMethod();

        Outer.Inner i = o.new Inner();
        i.innerMethod();
    }
}
