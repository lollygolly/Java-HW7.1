import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.getAllSales(sales));
        System.out.println(service.getAverageSalesAmount(sales));
        System.out.println(service.getMaxSales(sales));
        System.out.println(service.getMinSales(sales));
        System.out.println(service.getBelowAverageSales(sales));
        System.out.println(service.getAboveAverageSales(sales));
    }
}


