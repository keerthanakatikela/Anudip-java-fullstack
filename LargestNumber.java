package firstproject;

public class LargestNumber {
	public static void main(String[] args) {
		
		int a=45;
		int b=90;
		int c=68;
		//comparing values by using if else condition
		if(a>b) 
		{
			if(a>c) 
			{
				System.out.println(a+" is Largest");
			}
			else 
			{
				System.out.println(c+" is Largest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is Largest");
			}
			else 
			{
				System.out.print(c+" is Largest");
			}
		}
}
}
