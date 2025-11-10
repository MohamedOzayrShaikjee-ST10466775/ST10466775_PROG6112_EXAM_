/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsalesreportapp;

/**
 *
 * @author ST10466775 Mohamed Ozayr Shaikjee.
 */
public interface IProduct {
    
    int TotalSales(int[][] productSales);
    double AverageSales(int[][] productSales);
    int MaxSales(int[][] productSales);
    int MinSales(int[][] productSales);
}

//------------------------------- END OF FILE --------------------------------//