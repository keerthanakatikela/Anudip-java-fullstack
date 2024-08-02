package firstproject;
import java.util.Scanner;
public class PalindromeNumbers {
     public static void main(String [] args)
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the value: ");
    	 int m=sc.nextInt();
    	 System.out.println("Enter the value: ");
    	 int n=sc.nextInt();
    	 for(int i=m;i<=n;i++)
    	 {
    		 int rev=0;
    		 int num=i;
    		 while(num>0)
    		 {
    			 int r=num%10;
    			 rev=rev*10+r;
    			 num=num/10;
    		 }
    		 if(i==rev)
    		 {
    			 System.out.println(rev+" is a palindrome number ");
    		 }
    	 }
     }
}
