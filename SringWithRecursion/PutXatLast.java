package SringWithRecursion;

public class PutXatLast {
	public static StringBuilder str = new StringBuilder();
	public static int count=0;
	public static StringBuilder Xlast(String s,int index) {
		
		if(index==s.length()) {
			
			for(int i=0;i<count;i++) {
				str.append('X');
			}
			return str;
			
		}
		
		if(s.charAt(index)=='x'||s.charAt(index)=='X') {
			count++;
		}
		else {
			str.append(s.charAt(index));
		}
		
		Xlast(s,index+1);
		return str;
		//
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(Xlast("assasxaxaskljxxxxas",0));
	}

}
