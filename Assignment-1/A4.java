/*4. Write a Java program to read characters from the
console using Buffered Reader class.*/

import java.io.*;
class A4{
public static void main(String []args) throws IOException{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    String str;
    System.out.println("Enter lines of text.");
    System.out.println("Enter 'stop' to quit.");
    do {
    str = br.readLine();
    System.out.println(str);
    } while(!str.equals("stop"));
    } 
}
