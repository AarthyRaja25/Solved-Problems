package org.task;
import java.util.*;
public class pyramid {
	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
		
		
	
	}

}
