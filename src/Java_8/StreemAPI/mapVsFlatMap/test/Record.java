


package Java_8.StreemAPI.mapVsFlatMap.test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Record {
    public static void main(String[] args) {
        List<TestRecd> records = PatentData2.getAll();

        Set<String> patientsWithUnbilledTests = records.stream()
                .filter(r -> !r.getIsBilled())
                .map(TestRecd::getPatientId)
                .collect(Collectors.toSet());

        System.out.println(patientsWithUnbilledTests);
    }
}
