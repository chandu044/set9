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
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				if(i!=1)
				System.out.print(i);
				else if(a==1||b==1)
				System.out.print(i);
			}
		}
	}
}
