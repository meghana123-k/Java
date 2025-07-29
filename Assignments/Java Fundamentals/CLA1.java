public class CLA1 {
    public static void main(String... args) {
        if (args.length >= 2) {
            String company = args[0];
            String location = args[1];
            System.out.println(company + " Technologies " + location);
        } else {
            System.out.println("You did not entered company and location inputs");
        }
    }
}
