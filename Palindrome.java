package firstproject;
//WAP to find whether the given no by user is palindrome or not.
import java.util.Scanner;
public class Palindrome {
	public static void main(String [] args)
	  {
		  /*------object of scanner class-----*/
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a number : ");
		  int num;
		  /*--------taking input from user-------*/
		  num=sc.nextInt();
		  /*----creating variables-----*/
		  int rem,sum,temp;
		  sum=0;
		  temp=num;
		  while(num>0)
		  {
			  rem=num%10;
			  sum=(sum*10)+rem;
			  num=num/10;
		  }
		  if(temp==sum)
		  {
			  System.out.println(" Palindrome Number");
		  }
		  else
		  {
			  System.out.println("Not a Palindrome Number");
		  }
	  }
	}
