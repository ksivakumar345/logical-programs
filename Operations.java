/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result
      1.Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5 Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/ 

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {
  public static void main(String args[]){
Scanner sc=new Scanner(System.in);
   System.out.println("Enter first number: ");
  int a=sc.nextInt();
 System.out.println("Enter second number: ");
  int b=sc.nextInt();
  int  c=a-b;
  System.out.println("Difference of two numbers:"+c);
    int s3;
    System.out.println("enter first number");
  int s1=sc.nextInt();
 System.out.println("Enter second number: ");
  int s2=sc.nextInt();
  s3=s1*s2;
   System.out.println("Product of two numbers:"+s3); 
   int f3;
   System.out.println("enter first number");
   int f1=sc.nextInt();
   System.out.println("Enter second number: ");
   int f2=sc.nextInt();
    f3=f1/f2;
    System.out.println("Divison of two numbers:"+f3); 
    System.out.println("enter first number");
   int j=sc.nextInt(); 
    j++;
    j--;
     System.out.println("Increment and decrement the numbers:"+j); 
    int k;
    System.out.println("enter first number");
   int l=sc.nextInt();
   System.out.println("Enter second number: ");
   int m=sc.nextInt();
    k=l%m;
    System.out.println("Reminder of two numbers:"+k); 
       }
//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

}