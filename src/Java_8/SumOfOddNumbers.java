package Java_8;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

        int sumOfOdds = Arrays.stream(numbers)
                              .filter(n -> n % 2 != 0)  // Filters odd numbers
                              .sum();  // Sums them up

        System.out.println("Sum of odd numbers: " + sumOfOdds);
 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
   
        
       Long count= Arrays.stream(numbers).filter(n->n%2!=0).count();
       
              Arrays.stream(numbers).boxed().distinct().sorted(Comparator.reverseOrder()).limit(1).findFirst();
       
       System.out.println(count);
       
       System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

       OptionalInt first = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst();     
       
       System.out.println(" second :-  "+first.getAsInt());
    }
}
