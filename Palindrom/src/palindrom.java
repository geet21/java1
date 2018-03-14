public class palindrom {

    public static void main(String[] args) {

        int sum,n,d1,d2,d3;
        n=101;
        	d1=n%100%10*100;
            d2=n%100/10*10;
            d3=n/100*1;
            sum=d1+d2+d3;
            if(sum==n)
            System.out.println("Given no. is Palindrome");
        else
            System.out.println("not Palindrome");
    }
}
