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
		int n=s.nextInt();
		int m=s.nextInt();
		int[] a=new int[100];
		int[] b=new int[100];
		int c=1;
		for(int i=1;i<=n||i<=m;i++)
		{
		a[i]=i*n;
		b[i]=i*m;
		} 
		for(int j=1;j<=m;j++)
		{
			for(int i=1;i<=n;i++)
			{
				if(a[i]==b[j])
				{

					if(c==1)
					{
				   	  System.out.print(a[i]);
			                       	  c=c+1;
					}
				}
		            //	break;	
			}
		}
		
	}
}
