package Accenture.dsajava.currancyQuestion;

import java.time.LocalDate;

public class ExchangeRate {

    private String currencyPair;
    private LocalDate date;
    private double rate;

    public ExchangeRate(String currencyPair, LocalDate date, double rate) {
        this.currencyPair = currencyPair;
        this.date = date;
        this.rate = rate;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
