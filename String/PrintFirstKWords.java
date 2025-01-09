package String;

public class PrintFirstKWords {
public static void main(String[] args) {
	String s="Hello I am a passionate developer";
	
	String str[]=s.split(" ");
	int k=4;
	StringBuilder sb=new StringBuilder();
	
	for(int i=0;i<k;i++) {
	sb.append(str[i]).append(" ");
	}
	String stt=new String(sb);
	System.out.println(stt);
	
}
}
