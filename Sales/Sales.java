package Workspace.Sales;

import java.util.Scanner;
public class Sales 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);       
        double[] sales = new double[10];
        int[] counter = new int[9];
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Ingrese las ventas del vendedor: " + (i + 1));
            sales[i] = (200 + (.09 * sc.nextDouble()));
  
        }   
    }
        
}
