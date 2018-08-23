/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int i=0,j=1;
		char[] a=s.toCharArray();
		try{
		while(i<n)
		{
			System.out.print(a[i]);
			i=i+2;
		}
		System.out.print(" ");
		while(j<n)
		{
		   System.out.print(a[j]);
		   j=j+2;
		}
		}
		catch(Exception e)
		{}
	}
}
