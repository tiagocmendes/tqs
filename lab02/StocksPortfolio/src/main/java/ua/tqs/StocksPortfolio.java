package ua.tqs;

// libraries
import java.util.List;
import java.util.ArrayList;

public class StocksPortfolio {
    /* Properties */
    private String name;
    private IStockMarket stockMarket;
    private List<Stock> stocksList = new ArrayList<Stock>();

    /* Custom methods */

    public IStockMarket getStockMarket() {
        return stockMarket;
    }

    public void setMarketService(IStockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }

    public double getTotalValue() {
        double total = 0;

        for(Stock s: stocksList)
            total += (this.stockMarket.getPrice(s.getName()) * s.getQuantity());

        return total;
    }

    public void addStock(Stock stock) {
        this.stocksList.add(stock);
    }


    /* Getters and Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
