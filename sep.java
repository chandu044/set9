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
		int n=s1.length();
		int i=0,j=1;
		char[] a=s1.toCharArray();
		while(i<n)
		{
			System.out.print(a[i]);
			i=i+2;
		}
		System.out.print(" ");
		while(j<=n)
		{
		   System.out.print(a[j]);
		   j=j+2;
		}
	}
}
