package edu.shawnhamilton.advancedjava;

import java.math.BigDecimal;

public class AppleStock implements StockService {
    private String companyName;
    private String symbol;
    private BigDecimal quote;

    public AppleStock() {

        // hardcoded values for our stock company
        companyName = "Apple";
        symbol = "APPL";
        quote = new BigDecimal("125.50");
    }

    public String toString() {
        return "Company Name: " + companyName + "\n" +
                "Symbol: " + symbol + "\n" +
                "Quote: " + quote + "\n";
    }

    public StockQuote getQuote(String symbol) {
        return null;
    }
}
