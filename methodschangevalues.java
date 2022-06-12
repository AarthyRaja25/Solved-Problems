package practiceprogram;
import java.util.Arrays;
public class methodschangevalues {
	
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	changevalue(arr);
	System.out.println(Arrays.toString(arr));
	
}
	
static void changevalue(int num[])	{
	///if you change anything in object using reference variable object will get changed	
num[0]	=99;
	
}


}
