package ru.netology.stats;

public class StatsService {
    public int getAllSales(int[] sales) { // Функция поиска суммы всех продаж
        int allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }
        return allSales;
    }

    public int getAverageSalesAmount(int[] sales) {
        return getAllSales(sales) / sales.length; // Функция поиска средней суммы продаж
    }

    public int getMaxSales(int[] sales) { // Функция поиска последнего месяца, когда сумма продаж была максимальной
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) { // Функция поиска последнего месяца, когда сумма продаж была минимальной
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getBelowAverageSales(int[] sales) { // Функция поиска количества месяцев, когда продажи были ниже средней суммы продаж
        int belowAverageSales = 0;
        for (int belowAverage : sales) {
            if (belowAverage < getAverageSalesAmount(sales)) {
                belowAverageSales = belowAverageSales + 1;
            } else {
                belowAverageSales = belowAverageSales + 0;
            }
        }
        return belowAverageSales;
    }

    public int getAboveAverageSales(int[] sales) { // Функция поиска количества месяцев, когда продажи были выше средней суммы продаж
        int aboveAverageSales = 0;
        for (int aboveAverage : sales) {
            if (aboveAverage > getAverageSalesAmount(sales)) {
                aboveAverageSales = aboveAverageSales + 1;
            } else {
                aboveAverageSales = aboveAverageSales + 0;
            }
        }
        return aboveAverageSales;
    }
}


