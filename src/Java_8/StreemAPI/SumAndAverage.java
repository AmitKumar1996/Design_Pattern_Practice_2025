package Java_8.StreemAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "N/A"));
    }
}


//Key Takeaways
//✅ Stream API makes code concise and readable.
//✅ Streams use functional programming principles.
//✅ Parallel Streams can improve performance but should be used wisely.
//✅ Operations like map(), filter(), collect() are commonly used in interviews.







