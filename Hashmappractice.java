package practiceprogram;
import java.util.HashMap;
public class Hashmappractice {
public static void main(String[] args)	{
HashMap<Integer,String> StudentName=new HashMap<Integer,String>();

	StudentName.put(1,"Aarthy");
	StudentName.put(2,"keerthy");
	StudentName.put(3,"shali");
	StudentName.put(4,"shiva");
	
	
//	System.out.println("Entries"+StudentName);
//	System.out.println("2nd element  "+StudentName.get(2));
//	System.out.println("3rd key  "+StudentName.get("shali"));
HashMap<Integer,HashMap> rollno=new HashMap<Integer,HashMap>();
	rollno.put(11,StudentName);
	System.out.println(rollno);
//	rollno.put(12,StudentName.put(2,"keerthy"));
//	rollno.put(13,StudentName.put(3,"shali"));
//	rollno.put(14,StudentName.put(4,"shiva"));
//	
	
	
	
	
}

}
