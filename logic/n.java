package logic;


class a {
	public static void as() {
		System.out.println("base as");
	}


public void aa() {
		System.out.println("aa base");
	}



}

class c extends a
{
	
	public void aa() {

	System.out.println("aa child");
	}

}
public class n  {
	
		public static void as() {
			System.out.println("as chlid");
		}

		
		public static void main(String[] args) {
	
	c nn=new c();
	nn.aa();
		
		}
}
