import java.util.Scanner;

public class SalesReportApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3]; // 3 products × 3 months

        for (int i = 0; i < products.length; i++) {
            for (int m = 0; m < 3; m++) {
                System.out.print("Enter number of sales for month " + (m + 1) +
                                 " for " + products[i] + " mattress: ");
                sales[i][m] = sc.nextInt();
            }
        }

        Product product = new Product(products, sales);
        PrintProduct printer = new PrintProduct();

        printer.printReportHeader();
        printer.printTotalProductSales(product.GetTotalProductsSold());
        printer.printAverageProductSales(product.GetAverageProductSold());
        printer.printMostPopularProduct(product.GetMostPopularProduct());

        sc.close();
    }
}