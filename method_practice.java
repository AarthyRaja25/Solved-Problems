package practiceprogram;
public class method_practice {
public int addnumbers(int a,int b) {
 int sum=a+b;
return sum;
}
public static void main(String[] args)
{	
int n1=100;
int n2=200;
//creating a object
method_practice obj=new method_practice();
//calling a method
//result --variable to store
int result=obj.addnumbers(n1,n2);
System.out.println(result);
}

}
