package edu.shawnhamilton.advancedjava;

public class MainMethod {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StockService appleQuote = StockServiceFactory.getQuote("APPL");
        System.out.println(appleQuote.toString());

        StockService googleQuote = StockServiceFactory.getQuote("GOOG");
        System.out.println(googleQuote.toString());

        StockService microsoftQuote = StockServiceFactory.getQuote("MICR");
        System.out.println(microsoftQuote.toString());
    }

}
