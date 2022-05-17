package org.sorting;
import java.util.Arrays;
import java.util.Scanner;
public class Bubblesort {
 public void bubble(int array[])
    {
		int n=array.length;
		for(int i=0;i<n-1;i++)
        {
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
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
