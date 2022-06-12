package practiceprogram;

public class encapsulationgettersetter {
	
private int length;
private int breadth;
	
	public int getlength(){
		return length;
		
	}
	public int getbreadth(){
		return breadth;
		
	}
	public void setlength(int l) {
		this.length=l;
		
	}
	public void setbreadth(int b) {
		this.breadth=b;
		
	}
	
	
	
	public static void main(String[] args) {
		encapsulationgettersetter length=new encapsulationgettersetter( );
		length.setlength(10);
		encapsulationgettersetter breadth=new encapsulationgettersetter( );
		breadth.setbreadth(20);
		System.out.println(length.getlength());
		System.out.println(breadth.getbreadth());
		
	}
	
	

}
