
package com.mycompany.electronicfranchise_q1;
public class ElectronicFranchise_Q1 {

    public static void main(String[] args) {
int salesMade[][]={{1000,2000,3000},{2000,3000,4000},{1500,1100,1200}};
String gamingConsoles[]={"PS5","XBOX","SWITCH"};
String city[]={"Cape Town","Port Elizabeth","Pretoria"};

System.out.println("--------------------");
System.out.println("GAMING CONSOLE REPORT");
System.out.println("--------------------");

for(int count=0;count<city.length;count++){
   System.out.print("      " +city[count] + "\t");    
    }
System.out.println();

for(int outer=0;outer<gamingConsoles.length;outer++){
    System.out.print(" " + gamingConsoles[outer]+"\t");
//inner loop
  for(int inner=0;inner<salesMade[outer].length;inner++){
    System.out.print( " " + salesMade[outer][inner]+"\t\t");      
  }
  System.out.println();
}

System.out.println("--------------------");
System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");
System.out.println("--------------------");


  int highestSales = 0;
  String highestCity = "";

  for(int row=0; row<city.length; row++){
   int total = 0;
   for(int col=0; col<gamingConsoles.length; col++){
    total += salesMade[row][col];
   }
   System.out.println(city[row]+" "+total);

   if(total > highestSales){
    highestSales = total;
    highestCity = city[row];
   }
  }

  System.out.println("");
  System.out.println("CITY WITH THE MOST SALES: "+highestCity.toUpperCase());
  System.out.println("------------------------------");

    }
}
