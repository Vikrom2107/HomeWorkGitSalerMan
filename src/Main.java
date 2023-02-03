public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{10, 20, 54});
        System.out.println("Максимальное значение: " + salesManager.max());
    }
}