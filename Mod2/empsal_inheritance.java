/*Write a java program to create a class employee having attribute salary . Create a child class programmer 
having attribute bonus and calculate salary as salary equals salary plus bonus and display salary and bonus of 
employee*/

class Employee {
	double salary;
}
class Programmer extends Employee{
	double bonus;
	void display(){
		salary=salary+bonus;
		System.out.println("Salary = "+salary);
	}
}
class empsal_inheritance{
	public static void main(String[]args){
		Programmer P =new Programmer();
		P.salary = 50000.50;
		P.bonus = 4500.45; 	 	
		P.display();
	}
}
