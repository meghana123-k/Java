
class PercentageOfInterest {
    public static void main(String[] args) {
        if(args.length >= 2) {
            String gender = args[0];
            int age = Integer.parseInt(args[1]);
            if(gender.equalsIgnoreCase("Female")) {
                if(age >= 1 && age <= 58) {
                    System.out.println("The Percentage of Interest is 8.2%");
                } else if(age > 58 && age <= 100) {
                    System.out.println("The Percentage of Interest is 9.2%");
                }
            } else if(gender.equalsIgnoreCase("Male")) {
                if(age >= 1 && age <= 58) {
                    System.out.println("The Percentage of Interest is 8.4%");
                } else if(age > 58 && age <= 100) {
                    System.out.println("The Percentage of Interest is 10.5%");
                }
            }
        }
    }    
}
