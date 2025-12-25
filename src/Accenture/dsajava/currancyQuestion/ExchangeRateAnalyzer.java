package Accenture.dsajava.currancyQuestion;

import java.time.LocalDate;
import java.util.List;

public class ExchangeRateAnalyzer {

    public double calculateAverageRate(
            
    		
    		
    		List<ExchangeRate> rates,
            String currencyPair,
            LocalDate startDate,
            
            
            LocalDate endDate) {

        // -------- VALIDATIONS --------
        if (rates == null || rates.isEmpty()) {
            throw new IllegalArgumentException("Rates list cannot be empty");
        }

        if (currencyPair == null || currencyPair.trim().isEmpty()) {
            throw new IllegalArgumentException("Currency pair cannot be empty");
        }

        if (!currencyPair.matches("[A-Z]{3}/[A-Z]{3}")) {
            throw new IllegalArgumentException("Invalid currency pair format");
        }

        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }

        if (startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("Start date cannot be after end date");
        }

        // -------- CORE LOGIC --------
        double sum = 0.0;
        int count = 0;

        for (ExchangeRate rate : rates) {

            if (rate.getCurrencyPair().equals(currencyPair)
                    && !rate.getDate().isBefore(startDate)
                    && !rate.getDate().isAfter(endDate)) {

                sum += rate.getRate();
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalStateException("No matching exchange rates found");
        }

        return sum / count;
    }
}
