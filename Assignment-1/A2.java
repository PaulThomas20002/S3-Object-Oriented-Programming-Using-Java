/*2.Write a Java Program to print number of
even numbers,odd numbers from a given
array of 10 integers.*/

import java.util.*;
class A2{
    public static void main(String []args){
        int even=0 , odd=0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the Number : ");
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("The number of even number is : "+even);
        System.out.println("The number of odd number is : "+odd);
        
    }
}
