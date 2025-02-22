package Java_8.StreemAPI;

import java.util.Arrays;
import java.util.List;

public class CountFaildStudents {

	public static void main(String[] args) {
		List<Integer> marks= Arrays.asList(99,29,30,35,25,28);
		                long faildStudents=marks.stream().filter(m -> m<30).count();
		                var counts1=marks.stream().filter(m -> m<30).count();
		                
		                System.out.println(faildStudents);

	}

}
