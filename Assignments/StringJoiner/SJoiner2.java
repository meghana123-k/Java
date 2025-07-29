import java.util.StringJoiner;

class SJoiner2 {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("Hi");
        sj1.add("Hello");
        sj1.add("World");
        StringJoiner sj2 = new StringJoiner("-");
        sj2.add("Hi1");
        sj2.add("Hello1");
        sj2.add("World1");
        sj1.merge(sj2);
        System.out.println("SJ1: "+sj1);
        sj2.merge(sj1);
        System.out.println("SJ2: "+sj2);
    }
}
