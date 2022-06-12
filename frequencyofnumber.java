package practiceprogram;
import java.util.Scanner;
public class frequencyofnumber {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("number");
  int n=sc.nextInt();
  System.out.println("Array");
  int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int visited=-1;
for(int i=0;i<n;i++)
{
	int count=0;
	for(int j=i+1;j<n;j++)
	{
	if(arr[i]==arr[j])
		
	{
		count++;
	}
	
	
}
	
System.out.println(count);
	}	
	
}
}