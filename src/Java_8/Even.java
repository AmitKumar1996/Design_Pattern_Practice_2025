package Java_8;

import java.util.*;
import java.util.stream.*;

public class Even{
    public static void main(String args[]) {
      List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
            list.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);

    /* or can also try below method */

//When numbers are given as Array 
 int[] arr = {10,15,8,49,25,98,32};

    Map<Boolean, List<Integer>> list1 = Arrays.stream(arr).boxed()
    .collect(Collectors.partitioningBy(num -> num % 2 == 0));
    System.out.println(list1);
       }
   }


//Output: 
//10, 8, 98, 32
