
package org.sorting;

import java.util.Scanner;

public class Insertion{
	public static void insertion(int array[])
	{
		int n=array.length;
		int j;
		int key;
		for(int i=1;i<n;i++)
		{
		 key=array[i];
		 j=i-1;
		while(j>=0 && key<=array[j])
		{
			array[j+1]=array[j];
			j=j-1;
			
			}
		array[j+1]=key;
	}

}
	
public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int Array[]=new int[n];
			for(int i=0;i<n;i++)
			{
				Array[i]=scan.nextInt();
			}
			Insertion obj=new Insertion();
			obj.insertion(Array);
		    for (int i = 0; i < n; ++i)
		        System.out.print(Array[i] + " ");
		    System.out.println();
		}
		

		
	}


