package demoqawebsite;

import java.util.HashSet;

public class Find_Duplicates_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "interview";
		HashSet<Character> set = new HashSet<>();
		for (char ch : str.toCharArray()) {
		    if (!set.add(ch)) {
		        System.out.println("Duplicate: " + ch);
		    }
		}

	}

}
