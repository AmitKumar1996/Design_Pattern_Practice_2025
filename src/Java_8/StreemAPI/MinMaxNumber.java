package Java_8.StreemAPI;
import java.util.Arrays;
import java.util.List;

public class MinMaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 50, 40);
        
        int max = numbers.stream().max(Integer::compare).orElseThrow();
        int min = numbers.stream().min(Integer::compare).orElseThrow();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
