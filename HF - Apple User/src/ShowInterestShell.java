
/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 *
 */


import java.io.Console;
import java.util.*;
public class ShowInterestShell 
{
   public static void main(String[] args) 
   {
         /**
          * ask the required info, 
          * create a for loop, 
          * call print table method for each set of info
          */
      Scanner kb = new Scanner(System.in);

      
      System.out.println("How many times do you want to run the program:" +" ");
      int times = kb.nextInt();

      for(int i = 1; i<=times; i++)
      {
         System.out.println("Enter the initial deposit:");
         double amount = kb.nextDouble();
         
         System.out.println("Enter the number of years you want to calculate the interest:");
         int periods = kb.nextInt();
         
         System.out.println("Enter the annual interest rate:");
         double rate = kb.nextDouble();
         
         System.out.println("Enter the amount of your monthy deposit:" + " ");
         double deposit = kb.nextDouble();
         
         printTable(amount, periods, rate, deposit);
      }
   }              
              
   public static void printTable(double amount, int periods, double rate, double deposit) 
   {
      /**
       * create a for loop, 
       * calculate the amount of interest for each year,
       * do other calculations
       * print the info 
       */
      System.out.println("Year \tInterest \tDeposit \tNew Balance");
      System.out.println("start" +"\t\t\t\t\t" +amount);
      double interest = (amount*rate)/100;
      double balance = amount;
      
      for(int j = 1; j<=periods; j++)
      {
         interest = (amount*rate)/100;
         balance += interest + deposit;
         amount += deposit;
         System.out.println(j+ "\t" +(interest)+ "\t\t"+deposit+ "\t\t"+(balance));
      }
      System.out.println("***************************************************");
   }  
}