package demoqawebsite;

import java.util.HashSet;

public class Find_Duplicates_Inarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int str[]= {1,1,2,3,4,4,5};
		HashSet<Integer> set = new HashSet<>();
		for (int ch : str) 
		{
		    if (!set.add(ch)) {
	 	        System.out.println("Duplicate: " + ch);
	     } 
		

}}}
	
