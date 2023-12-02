package ru.netology.stats;

public class StatsService {
    public long getAllSales(long[] sales) { // Функция поиска суммы всех продаж
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }
        return allSales;
    }

    public long getAverageSalesAmount(long[] sales) {
        return getAllSales(sales) / sales.length; // Функция поиска средней суммы продаж
    }

    public int getMaxSales(long[] sales) { // Функция поиска последнего месяца, когда сумма продаж была максимальной
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales(long[] sales) { // Функция поиска последнего месяца, когда сумма продаж была минимальной
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getBelowAverageSales(long[] sales) { // Функция поиска количества месяцев, когда продажи были ниже средней суммы продаж
        int belowAverageSales = 0;
        long averageSalesAmount = getAverageSalesAmount(sales);
        for (long belowAverage : sales) {
            if (belowAverage < averageSalesAmount) {
                belowAverageSales++;
            }
        }
        return belowAverageSales;
    }

    public int getAboveAverageSales(long[] sales) { // Функция поиска количества месяцев, когда продажи были выше средней суммы продаж
        int aboveAverageSales = 0;
        long averageSalesAmount = getAverageSalesAmount(sales);
        for (long aboveAverage : sales) {
            if (aboveAverage > averageSalesAmount) {
                aboveAverageSales++;
            }
        }
        return aboveAverageSales;
    }
}


