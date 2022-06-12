package practiceprogram;

public class encpsulationpractice {
  private String name;
  private int rollno;
	
  public String getname() {
	return name;  
  }
  public int getrollno() {
	  return rollno;
  }
  public void setname(String name) {
	  this.name=name;
  }
  public void setrollno(int num) {
	  rollno=num;
  }
  
  
  
  
	
	
public static void main(String[] args){
	
	encpsulationpractice studentname=new encpsulationpractice();
	studentname.setname("aarthy");
	encpsulationpractice studentrollno=new encpsulationpractice();
	studentrollno.setrollno(567);
	System.out.println(studentname.getname());
	System.out.println(studentrollno.getrollno());
	
	
	
	
	
	
}
	
	
	
	
	
	
}
