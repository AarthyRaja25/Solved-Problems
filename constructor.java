package practiceprogram;

public class constructor {
	// this represents this variables and 
	String carname;
	int caryear;
	constructor(String carname,int caryear) 
	{
		//this represent the instance of the class
		this.carname=carname;
		this.caryear=caryear;	
	}
	
	public static void main(String[] args) {
	 
		constructor car=new constructor("mustang",1996);
		
		System.out.println(car.carname);
		System.out.println(car.caryear);
		
	}

}



