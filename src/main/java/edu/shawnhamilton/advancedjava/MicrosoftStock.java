package edu.shawnhamilton.advancedjava;

import java.math.BigDecimal;

public class MicrosoftStock implements StockService {

    private String companyName;
    private String symbol;
    private BigDecimal quote;

    // hardcoded values for our stock company
    public MicrosoftStock() {
        companyName = "Microsoft";
        symbol = "MCSFT";
        quote = new BigDecimal("105.25");
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
