package org.task;

	import java.util.Scanner;
	public class inversepyramid {
		public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=1;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k<=1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}

	}


