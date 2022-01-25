/*1. Write a program that will read the value of
x and evaluate the following function
y = { 1 for x > 0
{ 0 for x = 0
{ -1 for x < 0 Using if else statement.*/


import java.util.*;
public class assignment1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		int b;
		if(a>0)
		    b=1;
		else if(a==0)
		        b=0;
		else 
		    b=-1;
		System.out.println("Y = "+b);
	}
}
