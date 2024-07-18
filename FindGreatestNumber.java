package firstproject;
//Write a program to input any five number and find out the greatest number among them.
public class FindGreatestNumber {
  public static void main(String [] args)
  {
	  int a=10;
	  int b=20;
	  int c=60;
	  int d=70;
	  int e=50;
	  if(a>b && a>c && a>d && a>e)
	   {
		  System.out.println("a is greater");
	   }
	  else if(b>c&& b>d && b>e&& b>a)
		  {
			  System.out.println("b is greater");
		  }
	  else if(c>d && c>e && c>b && c>a)
		  {
			  System.out.println("c is greater");
		  }
	  else if(d>a && d>b && d>c && d>e)
		  {
			  System.out.println("d is greater");
		  }
	  else
	  {
		  System.out.println("e is greater");
	  }
  }
}
