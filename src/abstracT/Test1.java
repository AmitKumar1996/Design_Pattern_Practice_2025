package abstracT;

import java.util.*;

public class Test1 {

    public static void main(String[] args) {
    	
    	
    	
    	
        int[] A = {1, 2, 3};
        List<List<Integer>> powerSet = new ArrayList<>();

        int n = A.length;
        int total = 1 << n;     // 2^n subsets

        for (int mask = 0; mask < total; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(A[i]);
                }
            }
            powerSet.add(subset);
        }

        System.out.println(powerSet);
    }
}
