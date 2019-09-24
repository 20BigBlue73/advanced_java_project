package edu.shawnhamilton.advancedjava;

import java.math.BigDecimal;

public class StockQuote implements StockService {
    private String companyName;
    private String symbol;
    private BigDecimal quote;

    public StockQuote(String companyName, String symbol, BigDecimal quote) {
        this.companyName = companyName;
        this.symbol = symbol;
        this.quote = quote;
    }
    public StockQuote getQuote(String symbol) {

        return this;
    }
    public String toString() {
        return "Company Name: " + companyName + "\n" +
                "Symbol: " + symbol + "\n" +
                "Quote: " + quote + "\n";
    }
}

