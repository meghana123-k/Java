import java.util.ArrayList;
import java.util.StringJoiner;

public class SJoiner1 {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Meghana");
        ar.add("Megha");
        ar.add("Meghna");
        ar.add("Meena");
        StringJoiner sj = new StringJoiner(" *** ", "{", "}");
        ar.forEach(element -> sj.add(element));
        System.out.println(sj);
    }
}
