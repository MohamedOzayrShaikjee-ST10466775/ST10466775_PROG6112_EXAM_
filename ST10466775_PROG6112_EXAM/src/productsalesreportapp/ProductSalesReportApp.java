/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productsalesreportapp;

/**
 *
 * @author ST10466775 Mohamed Ozayr Shaikjee.
 */
public class ProductSalesReportApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// Values of the product sales for the two years and the three quarters
       int[][] productSales = {
           {300, 150, 700}, // Year 1: Quarter 1, Quarter 2, Quarter 3
           {250, 200, 600}  // Year 2: Quarter 1, Quarter 2, Quarter 3
               
        };

// Creating an Instance of the ProductSales class for calculations
        ProductSales productSalesObj = new ProductSales();

    int totalSales = productSalesObj.TotalSales(productSales); // Total 
    double averageSales = productSalesObj.AverageSales(productSales); // Average
    int maxSales = productSalesObj.MaxSales(productSales); // Max
    int minSales = productSalesObj.MinSales(productSales); // Min

// Printing the Report
        System.out.println("Product Sales Report - 2025");
        System.out.println("-----------------------------------");
        System.out.println("Total Sales: " + Math.round(totalSales));
        System.out.println("Average Sales: " + Math.round(averageSales));
        System.out.println("Maximum Sales: " + Math.round(maxSales));
        System.out.println("Minimum Sales: " + Math.round(minSales));
        System.out.println("-----------------------------------");
    

    }
    
}

//------------------------------- END OF FILE --------------------------------//