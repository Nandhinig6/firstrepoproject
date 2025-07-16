package demoqawebsite;

import java.util.HashSet;

public class Remove_Duplicates_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] str = {1,1,3,4,5,5,6};
		HashSet<Integer> set = new HashSet<>();
		for (int ch : str) {
		    if (!set.add(ch)) {
		        System.out.println("Duplicate: " + ch);
		
		    }

	}

}}
