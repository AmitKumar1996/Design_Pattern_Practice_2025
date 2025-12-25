package Accenture.dsajava.currancyQuestion;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ExchangeRate> rates = Arrays.asList(
            new ExchangeRate("USD/INR", LocalDate.of(2023, 1, 1), 82.1),
            new ExchangeRate("USD/INR", LocalDate.of(2023, 1, 2), 82.3),
            new ExchangeRate("EUR/INR", LocalDate.of(2023, 1, 1), 89.5)
        );

        ExchangeRateAnalyzer analyzer = new ExchangeRateAnalyzer();

        double avg = analyzer.calculateAverageRate(
            rates,
            "USD/INR",
            LocalDate.of(2023, 1, 1),
            LocalDate.of(2023, 1, 31)
        );

        System.out.println(avg); // 82.2
    }
}
