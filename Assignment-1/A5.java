/*5 Create a user defined Exception ‘Invalid Number
Exception’. Write a Java program that computes the
average of N positive numbers given as Command
Line Arguments. Raise the Exception ‘Invalid Number
Exception’ on reading a negative number or zero as
input*/

import java.io.*;
class InvalidNumberException extends Exception{
    InvalidNumberException(String str){
    super(str);
    }
}
class A5{
    public static void check(int b) throws InvalidNumberException{
    if(b<=0){
    throw new InvalidNumberException("invalid number");
    }
}
    public static void main(String args[]){
    int[] a=new int[10];
    try{
    for(int i=0;i<args.length;i++){
    a[i]=Integer.parseInt(args[i]);
    check(a[i]);
    }
}
catch(InvalidNumberException e){
    System.out.println(e);
}
finally{
    System.out.println("Executed Successfully");
    }
}
}
