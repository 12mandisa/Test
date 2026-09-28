
package com.mycompany.electronicfranchise_q2;

public class ConsoleSales extends Console{
    
    public ConsoleSales(String store, String consoleType, int totalSales) {
        super(store, consoleType, totalSales);
    }
 public void printReport(){
     System.out.println("--------------------");
     System.out.println("CONSOLE SALES REPORT");
     System.out.println("-------------------");
     System.out.println("Store: "+ getStore());
     System.out.println("Console Type: "+ getConsoleType());
     System.out.println("Total Sales: "+getTotalSales());
 }
   
}
