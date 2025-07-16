package demoqawebsite;

public class Replace_Characters_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Welcome to Nallas";
		String[] words = name.split(" ");
		StringBuilder sb = new StringBuilder();
		 for(String word : words)
		 {
			 StringBuilder sb1 = new StringBuilder(word).reverse();
			 if(sb1.length()>1)
			 {
				 char first = sb1.charAt(0);
				 char last=sb1.charAt(sb.length()-1);
				 sb1.setCharAt(0, last);
				 sb1.setCharAt(sb.length()-1, first);
			 }
			 sb.reverse();
			 sb.append(sb1).append(" ");
			 }
		 System.out.println("output "+ sb.toString().trim());
		 }
		
	}


