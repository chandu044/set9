/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		char[] a=s1.toCharArray();
		int n=s1.length();
		int c=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					c=c+1;
				}
			}
		}
			if(c==0)
			{
				System.out.print("Yes");
			}
			else
			System.out.print("No");
			
		
	}
}
