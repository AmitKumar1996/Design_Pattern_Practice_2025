package Java_8.StreemAPI;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 9, 2, 1, 9, 5);
        
        int secondHighest = numbers.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("No second highest element"));
        
        System.out.println("Second Highest Number: " + secondHighest);
    }
}
//SQL

//Method:1  ✅ For MySQL / PostgreSQL / Oracle:

/*
SELECT MAX(salary) AS second_highest
FROM employee
WHERE salary < (SELECT MAX(salary) FROM employee);
*/

// Method :2   ✅ Using LIMIT (MySQL):
/*
SELECT DISTINCT salary
FROM employee
ORDER BY salary DESC
LIMIT 1 OFFSET 1;
*/

// Method 3:  Using ROW_NUMBER() (PostgreSQL / SQL Server / Oracle):


/*
 SELECT salary
FROM (
    SELECT salary, ROW_NUMBER() OVER (ORDER BY salary DESC) AS rnk
    FROM employee
) AS temp
WHERE rnk = 2;

 * */

// method: 4   Using DENSE_RANK() (Handles Duplicates):
/*
SELECT salary
FROM (
    SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
    FROM employee
) AS temp
WHERE rnk = 2;

*/

