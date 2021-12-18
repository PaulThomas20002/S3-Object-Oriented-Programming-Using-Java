/* To print the area of rectangle by creating a class named area taking the values of its length and breadth as parameters of it constructor and having a method named
returnArea , which returns the area of the rectangle length and breadth of the rectangle are entered through keyboard
Dated : 27/12/2021
Time : Period-5 Questions */
import java.util.*;
class area
{
	int length, breadth;
	area(int l, int b)
	{
		length=l;
		breadth=b;
	}
	int returnArea()
	{
		return length * breadth;
	}
}

class areaconstructorinput
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		area o = new area(a,b);
		int areaR = o.returnArea();
		System.out.println(areaR);
	}
}
