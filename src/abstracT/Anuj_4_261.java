package abstracT;

import java.util.*;

public class Anuj_4_261 {

    public static void main(String[] args) {

        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(Arrays.asList(1, 3));
        intervals.add(Arrays.asList(2, 6));
        intervals.add(Arrays.asList(15, 18));
        intervals.add(Arrays.asList(8, 10));
        intervals.add(Arrays.asList(15, 18));

        // 1️⃣ Sort intervals by start time
        intervals.sort(Comparator.comparingInt(a -> a.get(0)));
        
//        for (List<Integer> interval : intervals) {
//            System.out.println(interval);
//        }
//        
//        System.out.println("----------------------------------------------------------");

        List<List<Integer>> intervalAns = new ArrayList<>();

        int start = intervals.get(0).get(0); //1
        int end = intervals.get(0).get(1); //3

        // 2️⃣ Merge logic
        for (int i = 1; i < intervals.size(); i++) {
            List<Integer> current = intervals.get(i); // 2 6

            if (current.get(0) <= end) {
                // overlap → extend end
                end = Math.max(end, current.get(1)); //6
            } else {
                // no overlap → save previous
                intervalAns.add(Arrays.asList(start, end));
                start = current.get(0); // 8
                end = current.get(1);  //10
            }
        }

        // 3️⃣ Add last interval
        intervalAns.add(Arrays.asList(start, end));

        // Output
        for (List<Integer> interval : intervalAns) {
            System.out.println(interval);
        }
    }
}
