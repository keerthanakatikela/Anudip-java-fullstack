package firstproject;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
    	int n=153;
    	int temp=n;
    	int temp2=temp;
    	int count=0;
    	while(n>0)
    	{
    		count++;
    		n=n/10;
    	}
    	int sum=0;
    	while(temp>0)
    	{
    		int rem=temp%10;
    		int power=1;
    		for(int i=1;i<=count;i++)
    		{
    			power=power*rem;
    		}
    		sum=sum+power;
    		temp=temp/10;
    	}
    	if(sum==temp2)
    	{
    		System.out.println("Armstrong Number");
    	}
    	else
    	{
    		System.out.println("Not an Armstrong Number");
    	}
    }
}
