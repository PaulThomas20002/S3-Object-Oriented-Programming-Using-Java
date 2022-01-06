class superr{
	void show(){
		System.out.println("In Superr");
	}
}
class sub extends superr{
	void show(){
		System.out.println("In child");
	}
}
class DynaMethoddispatch{
	public static void main (String [] args){
		superr ob;    /* super class object reference */
		sub o = new sub();
		ob = o;
		ob.show();
		superr b = new superr();
		ob = b;
		ob.show();
		}
}
