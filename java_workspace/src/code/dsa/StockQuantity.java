package code.dsa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class StockQuantity {

    public static void main(String[] args) {

        Stock ss1 = new Stock("IBM", 100);
        Stock ss2 = new Stock("Accenture", 200);
        Stock ss3 = new Stock("Microsoft", 250);
        Stock ss4 = new Stock("IBM", 200);

        var stocks = new ArrayList<Stock>();
        stocks.add(ss1);
        stocks.add(ss2);
        stocks.add(ss3);
        stocks.add(ss4);

        Map<String, Integer> map = stocks.stream().collect(Collectors.groupingBy(Stock::getStockName, Collectors.summingInt(Stock::getQuantity)));
        Map.Entry<String, Integer> finalEntry = map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get();
        System.out.println(finalEntry);
    }
}

class Stock {

    String stockName;
    int quantity;

    public Stock(String stockName, int quantity) {
        this.stockName = stockName;
        this.quantity = quantity;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}