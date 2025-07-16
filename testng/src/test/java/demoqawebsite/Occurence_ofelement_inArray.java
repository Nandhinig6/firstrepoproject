package demoqawebsite;

import java.util.HashMap;

public class Occurence_ofelement_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,1,2,3};
		 HashMap<Integer, Integer> map = new HashMap<>();
		 for(int c : arr)
		 {
			 map.put(c, map.getOrDefault(c, 0)+1);  //this will return count of c //n=2
		 }
		 System.out.println(map);

	}

}
