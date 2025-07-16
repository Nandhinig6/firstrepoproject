package demoqawebsite;

public class Check_Number_IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13, count = 0;
		for (int i = 2; i <= n/2; i++) {
		    if (n % i == 0) {
		        count++;
		        break;
		    }
		}
		System.out.println(count == 0 ? "Prime" : "Not Prime");
	
}}
