package org.task;
import java.util.*;

public class vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter an Alphabet: ");
	       char ch=sc.next().charAt(0);
	
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	{
		System.out.print("VOWEL");
	}
	else
	{
		System.out.println("CONSONANT");
	}
		
		
	}

}
