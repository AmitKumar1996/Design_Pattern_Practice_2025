package Java_8.StreemAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountFaildStudents {

	public static void main(String[] args) {
		List<Integer> marks= Arrays.asList(99,29,30,35,25,28);
		                long faildStudents=marks.stream().filter(m -> m<30).count();
		                var counts1=marks.stream().filter(m -> m<30).count();
		                
		                System.out.println(faildStudents);

		                System.out.println(counts1);
		                List<Integer> collectSorted = marks.stream().sorted().collect(Collectors.toList());
		                System.out.println(collectSorted);
		                      //marks.stream().distinct().sorted(Comparator.reverseOrder()).limit(1).getClass();
		                
		                
	}

}
