/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.printproduct;

public class PrintProduct {
    public void printTotalProductSales(int total) {
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }

    public void printAverageProductSales(double average) {
        System.out.println("AVERAGE PRODUCT SALES: " + (int) average);
    }

    public void printMostPopularProduct(String mostPopular) {
        System.out.println("MOST POPULAR PRODUCT: " + mostPopular);
    }

    public void printReportHeader() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");
    }
}