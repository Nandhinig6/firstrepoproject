package demoqawebsite;

public class Reverse_Words_in_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "Welcome to java";
		String words[] = name.split(" ");
		StringBuilder sb= new StringBuilder();
		for( int i=words.length-1;i>=0;i--)
		{
			sb.append(words[i]).append(" ");
			
		}
		System.out.println("result is: " + sb.toString().trim());

	}

}
