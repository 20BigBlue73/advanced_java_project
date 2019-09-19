package edu.shawnhamilton.advancedjava;

import java.math.BigDecimal;

public class GoogleStock implements StockService {
    private String companyName;
    private String symbol;
    private BigDecimal quote;

    // hardcoded values for our stock company
    public GoogleStock() {
        companyName = "Google";
        symbol = "GOGL";
        quote = new BigDecimal("95.75");
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
