/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	//	System.out.println("Enter any string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String sortedstr=new String(ch);
		System.out.println(sortedstr);
	
	}
}
