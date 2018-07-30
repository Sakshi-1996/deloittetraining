package co.assessment.question3;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("Enter the length:");	
Scanner sc = new Scanner(System.in);

String str="null";
int len=sc.nextInt();
int[] a = new int[len];
for(int i=0;i<len;++i)
a[i]=sc.nextInt();
if(UserMainCode.checkTripplets(a))
str="TRUE";
else
str="FALSE";
System.out.println(str);



}

}
