/*5 Create a user defined Exception ‘Invalid Number
Exception’. Write a Java program that computes the
average of N positive numbers given as Command
Line Arguments. Raise the Exception ‘Invalid Number
Exception’ on reading a negative number or zero as
input.*/

import java.io.*;
class InvalidNumberException extends Exception{
    InvalidNumberException(String str){
    super(str);
    }
}
class A5_1.java{
    public static void main(String args[]){
    int[] a=new int[10];
    float sum=0; 
    int count=0;
    try{
    for(int i=0;i<args.length;i++){
        a[i]=Integer.parseInt(args[i]);
        if(a[i] <= 0)
            throw new InvalidNumberException(a[i]+" is an Invalid Number\n");
        else{
            count++;
            sum += a[i];
        }
    }
    System.out.println("Average : "+ sum/count);
}
catch(InvalidNumberException e){
    System.out.println(e +"Executed Successfully");
}
finally{
    System.out.println("Executed Successfully");
    }
}
}
