package practiceprogram;
public class methodchangevalueinprimitive {
public static void main(String[] args)
{
	int a=200;
	int b=700;
	System.out.println(a + " " + b);
	change(a, b);
	
	
	
}
static void change(int a,int b) {
int temp=a;
a=b;
b=temp;
//value doesn't swap as the values passed in method
System.out.println(a + " " + b);


}
}