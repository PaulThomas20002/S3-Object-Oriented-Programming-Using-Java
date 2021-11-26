import java.io.*;
import java.util.Scanner; 
public class addtwonum{             //class name should be same as filename

    public static void main( String[] args){
        System.out.println("My Second Program on Java To add two numbers... ");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = num1 + num2;         //adding two numbers
        System.out.println("Sum of " + num1 + " + " + num2 + " = " + num3);   //added numbers will displayed

        

    }
}
