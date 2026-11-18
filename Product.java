package com.mycompany.productsales;

public class Product implements IProduct {
    private String[] productNames;
    private int[][] monthlySales; // [product][month]
    private int[] totalPerProduct;

    public Product(String[] productNames, int[][] monthlySales) {
        this.productNames = productNames;
        this.monthlySales = monthlySales;
        this.totalPerProduct = new int[productNames.length];
        calculateTotals();
    }

    private void calculateTotals() {
        for (int i = 0; i < productNames.length; i++) {
            int sum = 0;
            for (int j = 0; j < monthlySales[i].length; j++) {
                sum += monthlySales[i][j];
            }
            totalPerProduct[i] = sum;
        }
    }

    public int GetTotalProductsSold() {
        int grandTotal = 0;
        for (int total : totalPerProduct) {
            grandTotal += total;
        }
        return grandTotal;
    }

    public double GetAverageProductSold() {
        return (double) GetTotalProductsSold() / productNames.length;
    }

    public String GetMostPopularProduct() {
        int maxIndex = 0;
        for (int i = 1; i < totalPerProduct.length; i++) {
            if (totalPerProduct[i] > totalPerProduct[maxIndex]) {
                maxIndex = i;
            }
        }
        return productNames[maxIndex] + "(" + totalPerProduct[maxIndex] + ")";
    }

    public int[] getTotalPerProduct() {
        return totalPerProduct;
    }
}