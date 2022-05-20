package org.task;
import java.util.*;



public class foreach {
	public static void main(String[] args){
		List employeeData=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		employeeData.add(0,name);
		long mobilenumber=input.nextLong();
		employeeData.add(1,mobilenumber);
		for(Object data: employeeData) {
			System.out.print(data +"\t");
		
	}
	System.out.println();

}
}
