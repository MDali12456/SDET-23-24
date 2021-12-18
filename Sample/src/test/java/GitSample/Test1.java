package GitSample;

public class Test1 {

	public static void main(String[] args) {

		int n=153;
		int temp=n;
		
		int sum=0;
		
		while(n>0)    {
			int r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
		}
if(temp==sum)
	System.out.println("Number is a Armstrong");
else {
	System.out.println("Not an Armstrong");
}
	}

}
