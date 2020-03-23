package ua.tqs;

// JUnit
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;


// Mockito
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

class StocksPortfolioTest {

    // Properties
    @Mock
    IStockMarket mockMarket;

    @InjectMocks
    StocksPortfolio portfolio = new StocksPortfolio();

    @BeforeEach
    void beforeEach() {
        System.out.println("Starting test");
        portfolio.setName("Mende's Portfolio");
        mockMarket = Mockito.mock(IStockMarket.class);
        portfolio.setMarketService(mockMarket);
    }


    @Test
    void getTotalValue() {
        this.portfolio.addStock(new Stock("Computer", 20));
        this.portfolio.addStock(new Stock("Monitor", 15));

        Mockito.when(mockMarket.getPrice("Computer")).thenReturn(600.0);
        Mockito.when(mockMarket.getPrice("Monitor")).thenReturn(150.0);

        double realValue = 20 * 600.0 + 15 * 150.0;

        assertEquals(portfolio.getTotalValue(), realValue);
    }
}