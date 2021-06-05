package practice;

public class PerfectNumbers {
	
	static class Q11
	{
	public static void main(String arg[])
	{
	int sum=0;
	for(int i=0;i<1001;i++)
	{
	sum=0;
	for(int j=1;j<i;j++)
	{
	if(i%j==0)
	{
	sum=sum+j;
	}
	}
	if(sum==i && sum!=0)
	System.out.print(i+"\t");
	}
	}
	}

}
