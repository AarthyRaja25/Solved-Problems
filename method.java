package practiceprogram;
import java.util.Scanner;
public class method {
	public static void main(String[] args) {
	int ans=sum2();	
	System.out.println("sum="+ans);
	
	}		
static int sum2()
{
	Scanner in=new Scanner (System.in);
	System.out.println("Enter a Number1");
	int num1=in.nextInt();
	System.out.println("Enter a Number2");
	int num2=in.nextInt();
	int sum=num1+num2;
	//System.out.println("sum"+sum);
		
	return sum;	
		
	}

}
