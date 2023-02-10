public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long average() {
        long max = max();
        long min = sales[0];
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
            if (sale < min) {
                min = sale;
            }
        }
        long average = (sum - max - min)/(sales.length-2);
        return average;
    }
}
