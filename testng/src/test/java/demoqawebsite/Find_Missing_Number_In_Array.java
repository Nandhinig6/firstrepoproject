package demoqawebsite;

public class Find_Missing_Number_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,5};
		int n=5;
		int sum=n*(n+1)/2;   //15
		int actualsum =0;
		for ( int val : a)
		{
			actualsum = actualsum+val; //1  //3 //7 //12
		}
		int result = sum-actualsum;
		System.out.println("missing number is:" + result );
		
			
		

	}

}
