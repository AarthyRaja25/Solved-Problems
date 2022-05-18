package arrayassignment;
import java.util.*;
public class grandchildren {
	public static void main(String[] args){
		String name="ronaldo";
		String child="";
		int count=0;
		String[][] array= {
				          {"luke","shaw"},
				           {"wayne","rooney"},
				           {"rooney","ronaldo"},
				           {"shaw","roooney"}};
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
			if(name.equals(array[i][1]))
			{
			child =array[i][0];
			}
			{
			if(child.equals(array[j][1]))
			{
				count++;
			}
			}
		}
	
		
		}
		System.out.println(count);
		
	}

}
