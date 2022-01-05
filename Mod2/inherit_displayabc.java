/* Create a class A having the methode display A to print the message "In method A. "
Create another class B having method B . To display the message "In method B".
Create class C from class B , create object of the cladd and display corresponding messages? */
class A {
	void methodA(){
		System.out.println("In method A");
	}
}
class B extends A {
	void methodB(){
		System.out.println("In method B");
	}
}
class C extends B {
	void methodC(){
		System.out.println("In method C");
	}
}
class inherit_displayabc{
	public static void main( String []args){
		C d = new C();
		d.methodA();
		d.methodB();
		d.methodC();
	}
}
