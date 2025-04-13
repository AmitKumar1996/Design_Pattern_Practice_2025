package Java_8.StreemAPI.mapVsFlatMap.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PatentData2 {

    public static List<TestRecd> getAll() {
        return Stream.of(
            new TestRecd("101", "Blood Test", false),
            new TestRecd("101", "X-Ray", true),
            new TestRecd("102", "MRI", true),
            new TestRecd("102", "CT Scan", true),
            new TestRecd("103", "ECG", false),
            new TestRecd("103", "Urine Test", false),
            new TestRecd("104", "Covid Test", false),
            new TestRecd("104", "Sugar Test", true),
            new TestRecd("105", "Thyroid Test", false),
            new TestRecd("106", "Vitamin D", true),

            // Extra 15 diverse cases
            new TestRecd("107", "Liver Function", true),
            new TestRecd("107", "Kidney Function", true),
            new TestRecd("108", "BP Check", false),
            new TestRecd("109", "Eye Test", false),
            new TestRecd("109", "Hearing Test", true),
            new TestRecd("110", "Heart Rate", false),
            new TestRecd("111", "Blood Pressure", true),
            new TestRecd("112", "Allergy Test", true),
            new TestRecd("112", "Cholesterol", false),
            new TestRecd("113", "Calcium Test", false),
            new TestRecd("113", "Iron Test", false),
            new TestRecd("114", "Lung Capacity", true),
            new TestRecd("115", "Glucose Tolerance", false),
            new TestRecd("116", "Vision Test", true),
            new TestRecd("116", "Hearing Test", false),
            new TestRecd("117", "Dengue", false),
            new TestRecd("117", "Malaria", true),
            new TestRecd("118", "Hepatitis B", true),
            new TestRecd("119", "HIV Test", false),
            new TestRecd("120", "Skin Allergy", true),
            new TestRecd("121", "Skin Allergy", false)
        ).collect(Collectors.toList());
    }
}
