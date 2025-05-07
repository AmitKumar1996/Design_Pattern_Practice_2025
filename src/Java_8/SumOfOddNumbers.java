package Java_8;
import java.util.Arrays;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumOfOdds = Arrays.stream(numbers)
                              .filter(n -> n % 2 != 0)  // Filters odd numbers
                              .sum();  // Sums them up

        System.out.println("Sum of odd numbers: " + sumOfOdds);
        
        
       Long count= Arrays.stream(numbers).filter(n->n%2!=0).count();
       
       System.out.println(count);
    }
}
