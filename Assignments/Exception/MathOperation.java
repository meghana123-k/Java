package Assignments.Exception;

public class MathOperation {
    public static void main(String...args) {
        try {
            if(args.length == 0) {
                throw new ArithmeticException("No Inputs provided, cannot compute average.");
            }
            int a[] = new int[args.length];
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(args[i]);
                sum += a[i];
            }
            System.out.println("sum = "+sum);
            System.out.println("Average = "+((double)sum/args.length));
        } catch(NumberFormatException nf) {
            System.out.println("Invalid Input! Please enter only integers.");
        } catch(ArithmeticException ae) {
            System.out.println(ae.getMessage());
        } catch(Exception e) {
            System.out.println("UnExpected error: "+e);
        }
    }
}