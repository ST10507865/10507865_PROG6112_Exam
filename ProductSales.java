package com.mycompany.productsales;
public class ProductSales implements IProduct {

    // Calculate total sales
    public int TotalSales(int[][] productSales) {
        int total = 0;

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total = total + productSales[i][j];
            }
        }
        return total;
    }

    // Calculate average sales
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        int count = 0;

        for (int i = 0; i < productSales.length; i++) {
            count = count + productSales[i].length;
        }

        double average = (double) total / count;
        return average;
    }

    // Find maximum sale
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] > max) {
                    max = productSales[i][j];
                }
            }
        }
        return max;
    }

    // Find minimum sale
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] < min) {
                    min = productSales[i][j];
                }
            }
        }
        return min;
    }
}