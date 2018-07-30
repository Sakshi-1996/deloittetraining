package co.assessment.question1;

import java.util.Scanner;

public class Calculation {

public static void main(String[] args) {
Arithmetic reference1 = new Addition();
Arithmetic reference2 = new Subtraction();
Arithmetic reference3 = new Multiplication();
Arithmetic reference4= new Division();

Arithmetic[] ref = {reference1, reference2, reference3, reference4};
int choice;	
System.out.println("1. Addition \n2.Subtraction \n3.Multiplication \n4.Division");  //choices available
System.out.println("Please Enter your choice: ");
Scanner scanner = new Scanner(System.in);
choice = scanner.nextInt();  //select your choice
System.out.println("Enter two numbers: ");
int num1=scanner.nextInt();  //1st number
int num2=scanner.nextInt();  //2nd number
System.out.println("Result is: " + ref[choice-1].calculate(num1, num2));
scanner.close();
}

}
