
package com.mycompany.electronicfranchise_q2;
import java.util.Scanner;

public class ElectronicFranchise_Q2 {

    public static void main(String[] args) {
 Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter beverage type");
               System.out.println("1)PS5");       
       System.out.println("2)XBOX");
       System.out.println("3)SWITCH");

       int action= scan.nextInt();
       scan.nextLine();
       

      System.out.println("Enter the store: ");
      String store=scan.nextLine();
     System.out.println("Enter the total sales of console for "+store);
      int totalSales=scan.nextInt();
 
ConsoleSales a1= new ConsoleSales ("number1 electronic store","PS5",500);
a1.printReport();

      
    }
}
