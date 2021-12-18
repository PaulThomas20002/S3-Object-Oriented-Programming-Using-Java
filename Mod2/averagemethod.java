/*Print average 3 numbers entered by user , by creating class named average having a methodem=, to calculate and print the average*/
class average
{
	void averagefn(double a , double b, double c)
	{
	System.out.println("Average = " + (a+b+c)/3) ;
	}
}

class averagemethod
{
	public static void main(String []args)
	{
		average o = new average();
		o.averagefn(2.5,3.5,5);
	
	}
}
