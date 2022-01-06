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
class methodoverriding{
	public static void main (String [] args){
		sub o = new sub();
		o.show();
		}
}
