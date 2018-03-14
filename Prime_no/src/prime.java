

public class prime {
	public static void main(String[] args) {
		int n,i;
		n=5;
		for(i=2;i<=10;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(n==i)
			System.out.print("Prime Number");
			else
				System.out.print("Not Prime Number");
	}

}