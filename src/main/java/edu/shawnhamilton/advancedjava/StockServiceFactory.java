package edu.shawnhamilton.advancedjava;

/**
 * Our factory class that will be used to instantiate company stock objects
 * based the symbol parameter representing the company. The method creates and
 * returns instances from company stock Classes that implement the StockService
 * Interface.
 */

import java.math.BigDecimal;

public class StockServiceFactory {

    public static StockService getQuote(String symbol) {

        StockQuote quote = null;
        if (symbol.equals("APPL"))
            quote = new StockQuote("Apple", symbol, new BigDecimal(130.00));
        if (symbol.equals("GOOG"))
            quote = new StockQuote("Google", symbol, new BigDecimal(110.00));
        if (symbol.equals("MICR"))
            quote = new StockQuote("Microsoft", symbol, new BigDecimal(105.00));

        return quote;

    }
}
