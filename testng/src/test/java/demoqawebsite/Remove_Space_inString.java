package demoqawebsite;

import java.util.HashSet;

public class Remove_Space_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Nandhini is my name";
		StringBuilder s = new StringBuilder(name);
		 //HashSet<Character> set = new HashSet<>();
		 String result=name.replace(" ", "");
		 System.out.println(result);

	}

}
