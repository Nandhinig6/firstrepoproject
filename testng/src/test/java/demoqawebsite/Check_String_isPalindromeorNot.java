package demoqawebsite;

public class Check_String_isPalindromeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String str = "madam";
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(rev)); // true */
		
		String name ="madam";
		String rev="";
		for(int i=4;i>=0;i--)
		{
		rev = rev+ name.charAt(i);
		}
		System.out.println(rev);



	}

}
