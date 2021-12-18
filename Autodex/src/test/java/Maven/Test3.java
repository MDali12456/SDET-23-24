package Maven;

public class Test3 {

	public static void main(String[] args) {
int a=0;
int b=1;
System.out.println(a&b);//a&b is bitwise operator if both value is 1 then only it give 1
for(int i=0;i<3;i++)
{
	int c=a+b;
	System.out.println(c);
	a=b;
	b=c;
}
	}
}


