package demoqawebsite;

public class Find_Largest_and_Smallestnumber_inarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int max = a[0];
		int min = a[0];
		for(int val : a)
		{
			if ( val > max)
			{
				max=val;
			}
			else if (val<min)
			{
				min=val;
			}
			
		}
		System.out.println("maxi value is" + max);
		System.out.println("min value is:" + min );
		
		

	}

}
