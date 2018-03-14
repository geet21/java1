

public class reverse {
	public static void main(String[] args) {
		int n,d1,d2,d3,sum;
		n=345;
	
		d1=n%100%10*100;
		d2=n%100/10*10;
		d3=n/100*1;
		sum=d1+d2+d3;
		System.out.print("Reverse of given number is " +sum);
	}

}