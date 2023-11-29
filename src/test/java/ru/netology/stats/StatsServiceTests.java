package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {
    @Test
    public void shouldFindAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAllSales = 180;
        int actualAllSales = service.getAllSales(sales);
        Assertions.assertEquals(expectedAllSales, actualAllSales);
    }

    @Test
    public void shouldFindAverageSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSalesAmount = 15;
        int actualAverageSalesAmount = service.getAverageSalesAmount(sales);
        Assertions.assertEquals(expectedAverageSalesAmount, actualAverageSalesAmount);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.getMaxSales(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldFindBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverageSales = 5;
        int actualBelowAverageSales = service.getBelowAverageSales(sales);
        Assertions.assertEquals(expectedBelowAverageSales, actualBelowAverageSales);
    }

    @Test
    public void shouldFindAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverageSales = 5;
        int actualAboveAverageSales = service.getAboveAverageSales(sales);
        Assertions.assertEquals(expectedAboveAverageSales, actualAboveAverageSales);
    }
}
