package demoqawebsite;

import java.util.HashMap;

public class Occurence_Of_CharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name = "Nandhini";
 HashMap<Character,Integer> map = new HashMap<>();
 for(char c : name.toCharArray())
 {
	 map.put(c, map.getOrDefault(c, 0)+1);
 }
 System.out.println(map);
 
 
 
 
 
	}

}
