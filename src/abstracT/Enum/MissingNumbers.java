package abstracT.Enum;
import java.util.*;
import java.util.stream.*;

public class MissingNumbers {
	
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(10);

        System.out.println("Original List: " + list);

        int min = list.stream().min(Integer::compareTo).get();
        int max = list.stream().max(Integer::compareTo).get();

        List<Integer> missing = IntStream.rangeClosed(min, max).filter(i -> !list.contains(i)).boxed()
                .collect(Collectors.toList());

        System.out.println("Missing Numbers: " + missing);
        
        
        List<Integer> collect = list.stream().distinct().filter(i-> !list.contains(i)).collect(Collectors.toList());
        
        System.out.println(collect);
    }
    
    public static void main(int a) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(10);

        System.out.println("Original List333333: " + list);

        int min = list.stream().min(Integer::compareTo).get();
        int max = list.stream().max(Integer::compareTo).get();

        List<Integer> missing = IntStream.rangeClosed(min, max).filter(i -> !list.contains(i)).boxed()
                .collect(Collectors.toList());

        System.out.println("Missing Numbers: " + missing);
        
        
        List<Integer> collect = list.stream().distinct().filter(i-> !list.contains(i)).collect(Collectors.toList());
        
        System.out.println(collect);
    }
}
