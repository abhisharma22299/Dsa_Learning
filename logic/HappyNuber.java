package logic;

public class HappyNuber {
public static int num(int num) {
	int temp,sum=0;
	while(num>0) {
		temp=num%10;
		sum=sum+temp;
		num=num/10;
	}
	//System.out.println(sum);//
return sum;
}
	
	public static void main(String[] args) {
	
		int sum=11;
		int temp=28;
		while(sum>=10) {
		sum=num(temp);
	temp=sum;	
	}
	if(sum==1) {
		System.out.println("Happy  Number ");
		
	}
	
	else {
		System.out.println("Not a happy number");
	}
	}
}
