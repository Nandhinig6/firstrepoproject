package demoqawebsite;

import java.util.Arrays;

public class Check_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Listen";
		String s2="silent";
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.equals(arr1,arr2));

	}

}
