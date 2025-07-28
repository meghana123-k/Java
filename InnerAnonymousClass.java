
abstract class A1 {
    public abstract void meth1();
    public abstract void meth2();

}

class InnerAnonymousClass {
    public static void main(String[] args) {
        A1 a = new A1(){
            public void meth1() {
                System.out.println("New Method");
            }
            public void meth2() {
                System.out.println("New method-2");
            }
        };
        a.meth1();
        a.meth2();
    }
}