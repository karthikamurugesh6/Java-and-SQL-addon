package program;
abstract class Student {
	abstract void m1();
}
class display extends Student{
	void m1() {
		System.out.println("haii");
	}
}
class Main{
	public static void main(String[]args) {
		display d=new display();
		d.m1();
	
	}
}
