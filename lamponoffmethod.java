package practiceprogram;

public class lamponoffmethod {
public static void main(String[] args)	{
	
	lamp bulb=new lamp();
	lamp helogen=new lamp();
	bulb.turnon();
	helogen.turnoff();
	
}	
}


class lamp
{
	
	
	
	
	
	boolean ison=true;
	
	void turnon() {
		boolean ison=true;
		System.out.println("light is on");
	}
		void turnoff() {
		boolean ison=false;
		System.out.println("light  is off");
	}
	
}
	
	
	
	
	
	
	


