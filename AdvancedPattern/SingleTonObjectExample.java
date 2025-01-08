package AdvancedPattern;

class Temp{
	private static Temp obj=null;
	 int i=0;
	private Temp() {
		
	}
	
public static Temp getObj() {
	if(obj==null) {
		obj= new Temp();
		return obj;
	}else {	return obj;
	}
	}

	
public void display() {
	System.out.println("In temp class display "+i );
	
}
}

public class SingleTonObjectExample {
public static void main(String[] args) {
Temp obj =Temp.getObj();
obj.display();
obj.display();

}
}

