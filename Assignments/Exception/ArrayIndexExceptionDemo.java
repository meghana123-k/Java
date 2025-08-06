package Assignments.Exception;

import java.util.*;

class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter n: ");
            int n = sc.nextInt();
            int a[] = new int[n];
            System.out.println("Enter elements ");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Enter index you want to access ");
            int idx = sc.nextInt();
            System.out.println("At " + idx + "th index, the element is " + a[idx]);
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
