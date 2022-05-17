package org.sorting;
import java.util.Scanner;
public class Selectionsort{
	public void selection(int array[])
	{
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
		 int minimum=array[i];
		for(int j=i+1;j<n;j++)
		{
			if(array[j]<minimum)
			{
			int temp=minimum;
			minimum=array[i];
			array[i]=temp;
		}
	}

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
			Bubblesort obj=new Bubblesort();
			obj.bubble(Array);
		    for (int i = 0; i < n; ++i)
		        System.out.print(Array[i] + " ");
		    System.out.println();
		}
		}
