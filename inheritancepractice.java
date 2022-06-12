package practiceprogram;

public class inheritancepractice {
	public static void main(String[] args) {
		//object of superclass
		cycle cy=new cycle(6,10);
		//speed of superclass
		System.out.println("speed gear of super class");
		System.out.println(cy.speed);
		System.out.println(cy.gear);
		
		//object of subclass ......in the constructor passed the value superclass(speed and gear 
		superbike sb=new superbike(cy.speed,cy.gear,36);
		System.out.println("speed gear height of sub class");
		System.out.println(sb.speed);
		System.out.println(sb.gear);
		System.out.println(sb.height);	
		System.out.println("after brake");
		
		// calling brake method
		sb.applybrake(2);
		System.out.println(sb.speed);
		//calling speedup method
		System.out.println("after brake");
		sb.speedup(6);
			
	}
}	
 class cycle{
	 //field variable of superclass
int speed;
int gear;
 // constructor of superclass
public cycle(int speed,int gear) {
	this.speed=speed;
	this.gear=gear;
}
// method to applybrake
public void applybrake(int decrement) {
	speed=speed-decrement;
}
// method to speedup
public void speedup(int increment) {
	
	speed=speed+increment;
}
}
class superbike extends cycle{
	//field variable of subclass
int  height;
//constructor of subclass 
public superbike(int speed,int gear,int height) {
	//  call the parentclass constructor..used to initialize values present in parentclass 
	super(speed,gear);
	this.height=height;
	
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


