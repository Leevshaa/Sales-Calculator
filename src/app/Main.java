package app;

public class Main {

    static int NUMBER_ORDER;
    static String PRODUCT = "Product";
    static String CURRENCY = "EUR";

    public static void main(String[] args) {

        int day;
        int pcs;
        double cost;
        String productName;
        day = 5;
        pcs = 41;
        cost = 296.424634;
        NUMBER_ORDER++;
        productName = "smartphone";
        double amountOfSales = pcs * cost;
        double avgCost = amountOfSales / day;

        System.out.printf("%s No %s: %s,%n" +
                        "total sales for %s days is %s %.2f,%n" +
                        "sales by day is %s %.2f.%n",
                PRODUCT, NUMBER_ORDER, productName, day,
                CURRENCY, amountOfSales, CURRENCY, avgCost);

        day = 7;
        cost = 10486.85;
        NUMBER_ORDER++;
        productName = "laptop";
        avgCost = cost / day;

        System.out.printf("%s No %s: %s, %n" +
                        "total sales for %s days is %s %s,%n" +
                        "sales by day is %s %.2f.",
                PRODUCT, NUMBER_ORDER, productName, day,
                CURRENCY, cost, CURRENCY, avgCost);

    }
}