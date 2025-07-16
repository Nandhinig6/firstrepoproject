package demoqawebsite;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicate_characters_instring_And_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String name = "Nandhini";
		StringBuilder s = new StringBuilder();
		 HashSet<Character> set = new HashSet<>();
		 for(char c : name.toCharArray())
		 {
			 if(set.add(c))
			 {
				 s.append(c);
			 }
		 }
		 System.out.println("string without duplicates:" + s.toString()); 
		
		/*String name="Nandhini";
		StringBuilder sb = new StringBuilder();
				HashSet<Character> set= new HashSet<>();
				for(char c : name.toCharArray())
				{
				if(set.add(c))
				{
				System.out.print(c);	
				} */
				
				
		 

	}
}
