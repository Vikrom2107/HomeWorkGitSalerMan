public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{10, 21, 54, 5, 12, 13, 4});
        System.out.println("Максимальное значение: " + salesManager.max());

        System.out.println("Среднее значение: " + salesManager.average());
    }
}