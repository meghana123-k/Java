//import java.util.*;

import java.util.HashMap;

class TwoSum {
    public static int[] twoSum(int a[], int t) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            if(map.containsKey(t-a[i])) {
                return new int[]{map.get(t - a[i]), i};
            }
            if(!map.containsKey(a[i])) {
                map.put(a[i], map.getOrDefault(a[i], i));
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int a[] = {3, 2, 4};
        int b[] = twoSum(a, 6);
        for (int i : b) {
            System.out.print(i+" ");
        }

    }    
}
