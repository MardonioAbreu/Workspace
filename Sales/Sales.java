package Workspace.Sales;
/*
Written by Mardonio Abreu
November 14, 2021
*/
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
        for (int i = 0; i < 10; i++)
        {
            if (sales[i] >= 200 && sales[i] <= 299)
            {
                counter[0]++;
            } 
            else if (sales[i] >= 300 && sales[i] <= 399)
            {
                counter[1]++;
            }
            else if (sales[i] >= 400 && sales[i] <= 499)
            {
                counter[2]++;
            }
            else if (sales[i] >= 500 && sales[i] <= 599)
            {
                counter[3]++;
            }
            else if (sales[i] >= 600 && sales[i] <= 699)
            {
                counter[4]++;
            }
            else if (sales[i] >= 700 && sales[i] <= 799)
            {
                counter[5]++;
            }
            else if (sales[i] >= 800 && sales[i] <= 899)
            {
                counter[6]++;
            }
            else if (sales[i] >= 900 && sales[i] <= 999)
            {
                counter[7]++;
            }
            else 
            {
                counter[8]++;
            }

        }
        System.out.print("Vendedores con salario entre $200 y $299 ");
        System.out.println(counter[0]);
        System.out.print("Vendedores con salario entre $300 y $399 ");
        System.out.println(counter[1]);
        System.out.print("Vendedores con salario entre $400 y $499 ");
        System.out.println(counter[2]);
        System.out.print("Vendedores con salario entre $500 y $599 ");
        System.out.println(counter[3]);
        System.out.print("Vendedores con salario entre $600 y $699 ");
        System.out.println(counter[4]);
        System.out.print("Vendedores con salario entre $700 y $799 ");
        System.out.println(counter[5]);
        System.out.print("Vendedores con salario entre $800 y $899 ");
        System.out.println(counter[6]);
        System.out.print("Vendedores con salario entre $900 y $999 ");
        System.out.println(counter[7]);
        System.out.print("Vendedores con salario mayor a $10000 ");
        System.out.println(counter[8]);
              
    }
        
}

