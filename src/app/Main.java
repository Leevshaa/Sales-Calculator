package app;

public class Main {
    
    static String PRODUCT = "Product";
    static String CURRENCY = "EUR";

    public static void main(String[] args) {

        int day;
        int pcs;
        int numberOrder = 0;
        double price;
        String productName;
        day = 5;
        pcs = 41;
        price = 296.42;
        numberOrder++;
        productName = "smartphone";
        double cost = pcs * price;
        double avgCost = cost / day;

        System.out.printf("%s No %s: %s,%n" +
                        "total sales for %s days is %s %.2f,%n" +
                        "sales by day is %s %.2f.%n",
                PRODUCT, numberOrder, productName, day,
                CURRENCY, cost, CURRENCY, avgCost);

        day = 7;
        pcs = 85;
        price = 123.37;
        numberOrder++;
        productName = "laptop";
        cost = pcs * price;
        avgCost = cost / day;

        System.out.printf("%s No %s: %s,%n" +
                        "total sales for %s days is %s %.2f,%n" +
                        "sales by day is %s %.2f.%n",
                PRODUCT, numberOrder, productName, day,
                CURRENCY, cost, CURRENCY, avgCost);

    }
}