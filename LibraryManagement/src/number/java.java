import java.util.*;

class java
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=n%2;
		n=n/2;
		String st=""+rem;
		int count=1;
		int i=0;
		int j=0;
		int[] lrg=new int[n];
		while(n>0)
		{
			rem=n%2;
			n=n/2;
			st=rem+st;	
		}
		System.out.println(st);
		for(i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='1'&& (i<st.length()-1))
			{
				if(st.charAt(i+1)=='1')
				{
					count++;
				}
			}
			else
			{	
				lrg[j]=count;
				count=1;
				j++;
			}
		}
		i=0;
		for(j=0;j<lrg.length;j++)
		{
			if(lrg[i]>lrg[j])
			{
				count=lrg[i];
			}
			else
			{
				count=lrg[j];
				i=j;
			}
			
		}
		System.out.println(count);
	}
}