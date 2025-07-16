package demoqawebsite;

public class Second_Largest_Number_inarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {20,30,10,50,60};
		/*int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for(int num : a)
		{
			if(num>largest)
			{
				secondlargest=largest;
				largest=num;
			}
		else if(num >secondlargest && num!=largest)
		{
			secondlargest=num;
		}
		}
		System.out.println("value is: "+ secondlargest); */
		
		//first largest 
		
		int c[]={10,20,500,600};
		int first = Integer.MIN_VALUE ;
		//-infinity
		
		for(int b :c)
		{
		if(b > first)
		{
       first =b;
		}
		}
		System.out.println("first largest " +  first);
		}

	}


