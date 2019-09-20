package edu.shawnhamilton.advancedjava;

/**
 * Our factory class that will be used to instantiate company stock objects
 * based the symbol parameter representing the company. The method creates and
 * returns instances from company stock Classes that implement the StockService
 * Interface.
 */

public class StockServiceFactory {
    public static StockService getQuote(String symbol) {
        if (symbol.equals("APPL"))
            return new AppleStock();
        if (symbol.equals("MCSFT"))
            return new MicrosoftStock();
        if (symbol.equals("GOGL"))
            return new GoogleStock();

        return null;
    }
}