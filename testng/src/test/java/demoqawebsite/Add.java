package demoqawebsite;

public class Add {
System.out.println("display changes edited here");
	
		int x,y;
		Add(int a,int b)
		{
		x=a;
		y=b;
		}
		void display()
		{
		int sum = x+y;
		System.out.println(sum);
		int sub = x-y;
		System.out.println(sub);
		int div =x/y;
		System.out.println(div);
		int mul = x*y;
		System.out.println(mul);

		}


		public static void main(String[] args)
		{
		Add a = new Add(5,6);
		a.display();


	}

}
