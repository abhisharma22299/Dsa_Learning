package Recursion;

public class MatrixWay {

	public static void ways(int cr,int cc,int dr,int dc,String s) {
	
		if(cr==dr&&cc==dc ) {
		System.out.println(s);
		return;
	}
	
	if(cr>dr||cc>dc) {
		return;
	}
	
	ways(cr, cc+1, dr, dc, s+"H");
	ways(cr+1, cc, dr, dc, s+"V");
}

	public static void main(String[] args) {
	ways(0, 0, 2, 2, "");

	}


}
