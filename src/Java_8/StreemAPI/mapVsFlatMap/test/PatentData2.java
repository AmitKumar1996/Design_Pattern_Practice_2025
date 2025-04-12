package Java_8.StreemAPI.mapVsFlatMap.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PatentData2 {

    public static List<TestRecd> getAll() {
        return Stream.of(
            // Patient 101: 1 unbilled, 1 billed
            new TestRecd("101", "Blood Test", false),
            new TestRecd("101", "X-Ray", true),

            // Patient 102: all billed
            new TestRecd("102", "MRI", true),
            new TestRecd("102", "CT Scan", true),

            // Patient 103: all unbilled
            new TestRecd("103", "ECG", false),
            new TestRecd("103", "Urine Test", false),

            // Patient 104: mix of true/false
            new TestRecd("104", "Covid Test", false),
            new TestRecd("104", "Sugar Test", true),

            // Patient 105: only one record, unbilled
            new TestRecd("105", "Thyroid Test", false),

            // Patient 106: only one record, billed
            new TestRecd("106", "Vitamin D", true)
        ).collect(Collectors.toList());
    }
}
