import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Для соблюдения принципа единой ответственности, выносим логику по товару
         * в отдельный класс Products
         */
        Products products = new Products();
        products.showProducts();

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            products.addPurchase(product, count);
        }

        long sum = products.sum(products.getProducts());
        System.out.println("ИТОГО: " + sum);
    }
}