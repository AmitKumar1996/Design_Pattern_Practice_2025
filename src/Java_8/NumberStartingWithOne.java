package Java_8;
import java.util.*;
import java.util.stream.*;

import abstracT.start_with_digit_1;

public class NumberStartingWithOne{
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
            myList.stream()
                  .map(s -> s + "") // Convert integer to String
                  .filter(s -> s.startsWith("1"))
                  .forEach(System.out::println);
            
      System.out.println("___________________________________________________________________________________________________________________________________________________________");


/* or can also try below method */

/* When numbers are given as Array */
 int[] arr = {10,15,8,49,25,98,32};
      List<String> list = Arrays.stream(arr).boxed()
                                .map(s -> s + "")
                                .filter(s -> s.startsWith("1"))
                                .collect(Collectors.toList());

    System.out.println(list);
System.out.println("___________________________________________________________________________________________________________________________________________________________");
    List<String> collect = Arrays.stream(arr).boxed().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
    
    System.out.println(collect);
    
    }
}

//Output:
//10, 15