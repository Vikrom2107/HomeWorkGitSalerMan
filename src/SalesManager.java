public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int average() {
        int max = (int) max();
        int min = sales[0];
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
            if (sale < min) {
                min = sale;
            }
        }
        int average = (sum - max - min)/(sales.length-2);
        return average;
    }
}
