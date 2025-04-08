package Java_8.StreemAPI.mapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
	
	public static  List<customer> getAll() {
        return Stream.of(
        		new customer(101, "Amit", "Amitkumar1996.1@gmail.com", Arrays.asList(8881065490L, 9998877654L)),
                new customer(102, "Vikash", "Vikashkumar2749.1@gmail.com", Arrays.asList(9503026573L, 9176241753L)),
                new customer(103, "Sandeep", "Sandeepkumar5398.1@gmail.com", Arrays.asList(9706035421L, 8989875622L)),
                new customer(104, "Ravi", "Ravikumar1894.1@gmail.com", Arrays.asList(9471625874L, 9553801547L)),
                new customer(105, "Rajesh", "Rajeshkumar3158.1@gmail.com", Arrays.asList(9965327481L, 9354761725L)),
                new customer(106, "Manoj", "Manojkumar7320.1@gmail.com", Arrays.asList(9102728302L, 9776332109L)),
                new customer(107, "Pankaj", "Pankajkumar4135.1@gmail.com", Arrays.asList(9802198447L, 9436501281L)),
                new customer(108, "Anil", "Anilkumar9524.1@gmail.com", Arrays.asList(9736986140L, 9357986482L)),
                new customer(109, "Sahil", "Sahilkumar8211.1@gmail.com", Arrays.asList(9098765463L, 9752190834L)),
                new customer(110, "Nikhil", "Nikhilkumar4903.1@gmail.com", Arrays.asList(9530621409L, 9442289573L)),
                new customer(111, "Amit", "Amitkumar5630.1@gmail.com", Arrays.asList(8887562345L, 9994789123L)),
                new customer(112, "Vikash", "Vikashkumar6821.1@gmail.com", Arrays.asList(9123456789L, 9278916523L)),
                new customer(113, "Sandeep", "Sandeepkumar2547.1@gmail.com", Arrays.asList(9703895634L, 9082674012L)),
                new customer(114, "Ravi", "Ravikumar8769.1@gmail.com", Arrays.asList(9507231458L, 9921023645L)),
                new customer(115, "Rajesh", "Rajeshkumar3316.1@gmail.com", Arrays.asList(9675237809L, 9445763901L)),
                new customer(116, "Manoj", "Manojkumar1225.1@gmail.com", Arrays.asList(9885463017L, 9574846921L)),
                new customer(117, "Pankaj", "Pankajkumar2750.1@gmail.com", Arrays.asList(9026871234L, 9871098475L)),
                new customer(118, "Anil", "Anilkumar5963.1@gmail.com", Arrays.asList(9312476520L, 9483675124L)),
                new customer(119, "Sahil", "Sahilkumar8471.1@gmail.com", Arrays.asList(9078564132L, 9726390854L)),
                new customer(120, "Nikhil", "Nikhilkumar1602.1@gmail.com", Arrays.asList(9546893025L, 9443961580L)),
                new customer(121, "Amit", "Amitkumar8462.1@gmail.com", Arrays.asList(9897742031L, 9092956710L)),
                new customer(122, "Vikash", "Vikashkumar2941.1@gmail.com", Arrays.asList(9384725931L, 9627164824L)),
                new customer(123, "Sandeep", "Sandeepkumar1103.1@gmail.com", Arrays.asList(9517408253L, 9368041759L)),
                new customer(124, "Ravi", "Ravikumar2710.1@gmail.com", Arrays.asList(9334216357L, 9881259042L)),
                new customer(125, "Rajesh", "Rajeshkumar7412.1@gmail.com", Arrays.asList(9086239514L, 9358741021L))
        ).collect(Collectors.toList());
    }
}
