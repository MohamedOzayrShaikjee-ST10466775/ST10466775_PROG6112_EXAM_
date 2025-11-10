/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsalesreportapp;

/**
 *
 * @author ST10466775 Mohamed Ozayr Shaikjee.
 */
public class ProductSales implements IProduct {

    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int[] yearly : productSales) {
            
// Sum the sales of each quarter for the year
            for (int sales : yearly) {
                total += sales;
            }
        }
        return total; // Returns the amount calculated as the Total
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int sum = 0;
        int count = 0;
        for (int[] yearly : productSales) {
            for (int sales : yearly) {
                sum += sales;
                count++;
            }
        }
        
// Calculation and return of the average
        return count == 0 ? 0 : (double) sum / count;
    }

    @Override
    public int MaxSales(int[][] productSales) {
        int max = Integer.MIN_VALUE;
        
// Find maximum sales value
        for (int[] yearly : productSales) {
            for (int sales : yearly) {
                if (sales > max) {
                    max = sales;
                }
            }
        }
        return max; // Returns the amount calculated as the Maximum
    }

    @Override
    public int MinSales(int[][] productSales) {
        int min = Integer.MAX_VALUE;
        
//  Find the minimum sales value
        for (int[] yearly : productSales) {
            for (int sales : yearly) {
                if (sales < min) {
                    min = sales;
                }
            }
        }
        return min; // Returns the amount calculated as the Minimum
    }
}
//------------------------------- END OF FILE --------------------------------//