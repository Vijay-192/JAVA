 //  wap a program to find maximum between two number?

import java.util.Scanner;
public class Maxi_2_number {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  System.out.print("Enter your first number ");
  int num1=input.nextInt();
  System.out.print("Enter your second number");
  int num2=input.nextInt();
  if (num1>num2) {
    System.out.print("Maximum number is "+num1);
    
  } else if ( num1<num2) {
    System.out.print("Maximum number is "+num2);

  }
  else
  {
    System.out.println("Both are equal "+num1);
  }
  }
  }