package Java_8.StreemAPI.mapVsFlatMap.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RecordAnalysis {

    public static void main(String[] args) {
        List<TestRecd> records = PatentData2.getAll();

        System.out.println("1. Get patient IDs with at least one unbilled test:");
        getPatientsWithUnbilledTests(records);

        System.out.println("\n2. Get test names that are unbilled:");
        getUnbilledTestNames(records);

        System.out.println("\n3. Group all tests by patient ID:");
        groupTestsByPatient(records);

        System.out.println("\n4. Count unbilled tests per patient:");
        countUnbilledTestsPerPatient(records);

        System.out.println("\n5. Get patients with only billed tests:");
        getPatientsWithOnlyBilledTests(records);

        System.out.println("\n6. Get patients with both billed and unbilled tests:");
        getPatientsWithMixedBilling(records);

        System.out.println("\n7. Handle empty test list (no patients):");
        handleEmptyRecordList();

        System.out.println("\n8. Handle null billing value safely:");
        handleNullBilling(records);

        System.out.println("\n9. Detect duplicate test records:");
        detectDuplicateTests(records);

        System.out.println("\n10. When all tests are billed:");
        allTestsBilledScenario();

        System.out.println("\n11. Sort patients by number of unbilled tests (desc):");
        sortPatientsByUnbilledCount(records);

        System.out.println("\n12. List all patients regardless of billing:");
        listAllPatients(records);

        System.out.println("\n13. List only unbilled test details:");
        listUnbilledTestDetails(records);

        System.out.println("\n14. Count total unbilled tests:");
        countTotalUnbilledTests(records);

        System.out.println("\n15. Group test names per patient:");
        groupTestNamesPerPatient(records);
    }

    // 1
    public static void getPatientsWithUnbilledTests(List<TestRecd> records) {
        Set<String> result = records.stream()
                .filter(r -> !r.getIsBilled())
                .map(TestRecd::getPatientId)
                .collect(Collectors.toSet());
        System.out.println(result);
    }

    // 2
    public static void getUnbilledTestNames(List<TestRecd> records) {
        List<String> testNames = records.stream()
                .filter(r -> !r.getIsBilled())
                .map(TestRecd::getTestName)
                .collect(Collectors.toList());
        System.out.println(testNames);
    }

    // 3
    public static void groupTestsByPatient(List<TestRecd> records) {
        Map<String, List<TestRecd>> grouped = records.stream()
                .collect(Collectors.groupingBy(TestRecd::getPatientId));
        grouped.forEach((k, v) -> System.out.println(k + " => " + v));
    }

    // 4
    public static void countUnbilledTestsPerPatient(List<TestRecd> records) {
        Map<String, Long> counts = records.stream()
                .filter(r -> !r.getIsBilled())
                .collect(Collectors.groupingBy(TestRecd::getPatientId, Collectors.counting()));
        System.out.println(counts);
    }

    // 5
    public static void getPatientsWithOnlyBilledTests(List<TestRecd> records) {
        Set<String> result = records.stream()
                .collect(Collectors.groupingBy(TestRecd::getPatientId))
                .entrySet().stream()
                .filter(e -> e.getValue().stream().allMatch(TestRecd::getIsBilled))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(result);
    }

    // 6
    public static void getPatientsWithMixedBilling(List<TestRecd> records) {
        Set<String> result = records.stream()
                .collect(Collectors.groupingBy(TestRecd::getPatientId))
                .entrySet().stream()
                .filter(e -> {
                    boolean hasBilled = e.getValue().stream().anyMatch(TestRecd::getIsBilled);
                    boolean hasUnbilled = e.getValue().stream().anyMatch(r -> !r.getIsBilled());
                    return hasBilled && hasUnbilled;
                })
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(result);
    }

    // 7
    public static void handleEmptyRecordList() {
        List<TestRecd> emptyList = new ArrayList<>();
        Set<String> result = emptyList.stream()
                .filter(r -> !r.getIsBilled())
                .map(TestRecd::getPatientId)
                .collect(Collectors.toSet());
        System.out.println(result); // Should print: []
    }

    // 8
    public static void handleNullBilling(List<TestRecd> records) {
        List<TestRecd> withNull = new ArrayList<>(records);
        withNull.add(new TestRecd("999", "NullBillingTest", null));

        Set<String> safeResult = withNull.stream()
                .filter(r -> Boolean.FALSE.equals(r.getIsBilled()))
                .map(TestRecd::getPatientId)
                .collect(Collectors.toSet());
        System.out.println(safeResult);
    }

    // 9
    public static void detectDuplicateTests(List<TestRecd> records) {
        Set<String> uniqueKeys = new HashSet<>();
        List<TestRecd> duplicates = records.stream()
                .filter(r -> !uniqueKeys.add(r.getPatientId() + r.getTestName()))
                .collect(Collectors.toList());
        System.out.println(duplicates);
    }

    // 10
    public static void allTestsBilledScenario() {
        List<TestRecd> billedOnly = Stream.of(
                new TestRecd("201", "X", true),
                new TestRecd("202", "Y", true)
        ).collect(Collectors.toList());

        Set<String> result = billedOnly.stream()
                .filter(r -> !r.getIsBilled())
                .map(TestRecd::getPatientId)
                .collect(Collectors.toSet());
        System.out.println(result); // []
    }

    // 11
    public static void sortPatientsByUnbilledCount(List<TestRecd> records) {
        Map<String, Long> counts = records.stream()
                .filter(r -> !r.getIsBilled())
                .collect(Collectors.groupingBy(TestRecd::getPatientId, Collectors.counting()));

        LinkedHashMap<String, Long> sorted = counts.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        System.out.println(sorted);
    }

    // 12
    public static void listAllPatients(List<TestRecd> records) {
        Set<String> allPatients = records.stream()
                .map(TestRecd::getPatientId)
                .collect(Collectors.toSet());
        System.out.println(allPatients);
    }

    // 13
    public static void listUnbilledTestDetails(List<TestRecd> records) {
        records.stream()
                .filter(r -> !r.getIsBilled())
                .forEach(r -> System.out.println(r.getPatientId() + " => " + r.getTestName()));
    }

    // 14
    public static void countTotalUnbilledTests(List<TestRecd> records) {
        long count = records.stream()
                .filter(r -> !r.getIsBilled())
                .count();
        System.out.println("Total unbilled tests: " + count);
    }

    // 15
    public static void groupTestNamesPerPatient(List<TestRecd> records) {
        Map<String, List<String>> grouped = records.stream()
                .collect(Collectors.groupingBy(
                        TestRecd::getPatientId,
                        Collectors.mapping(TestRecd::getTestName, Collectors.toList())
                ));
        System.out.println(grouped);
    }
}
