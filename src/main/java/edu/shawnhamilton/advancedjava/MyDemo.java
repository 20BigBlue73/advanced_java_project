package edu.shawnhamilton.advancedjava;

/**
 * Our main method class that uses the three different company symbols
 * as parameters to determine which objects will be instantiated from our
 * StockServiceFactory Class.
 */
public class MyDemo {
        public static void main(String[] args) {

            StockService appleQuote = StockServiceFactory.getQuote("APPL");
            System.out.println(appleQuote.toString());

            StockService microsoftQuote = StockServiceFactory.getQuote("MCSFT");
            System.out.println(microsoftQuote.toString());

            StockService googleQuote = StockServiceFactory.getQuote("GOGL");
            System.out.println(googleQuote.toString());

        }
}
