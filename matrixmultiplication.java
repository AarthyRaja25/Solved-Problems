package arrayassignment;
import java.util.*;
public class matrixmultiplication {
	 
public static void main(String[] args)	{
	
	int a[][]= {{1,2},{2,4}};
	int b[][]= {{5,6,7},{8,9,10}};
	int c[][]=new int[2][3];
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			 c[i][j]=0;
			 for(int k=0;k<2;k++)
			 {
				c[i][j] +=a[i][k]* b[k][j];
			 }
		}
		
	}
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	
	}

}
