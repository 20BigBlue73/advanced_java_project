package edu.shawnhamilton.advancedjava;

import java.math.BigDecimal;

public class StockQuote {
    private String companyName;
    private String symbol;
    private BigDecimal quote;

    public StockQuote(String companyName, String symbol, BigDecimal quote) {
        this.companyName = companyName;
        this.symbol = symbol;
        this.quote = quote;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setQuote(BigDecimal quote) {
        this.quote = quote;
    }

    public String getCompanyName(String companyName) {
        return companyName;
    }

    public String getSymbol(String symbol) {
        return symbol;
    }

    public BigDecimal getQuote(BigDecimal quote) {
        return quote;
    }

    public StockQuote getQuote(String symbol) {
        return this;
    }
}
