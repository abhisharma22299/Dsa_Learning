package logic;

class Base{
	public void Print() {
		System.out.println("Base");
	}
}
class Drived extends Base{
	public void Print() {
		System.out.println("Drived");
	}
}
public class ClassOutput {
public static void DoPrint(Base o) {
	o.Print();
}
	public static void main(String[] args) {
	Base x=new Base();
	Base y=new Drived();
	Drived z=new Drived();
	DoPrint(x);
	DoPrint(y);
	DoPrint(z);
	}
}
