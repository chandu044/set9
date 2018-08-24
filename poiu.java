/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b;
		char c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
	//	System.out.print(" ");
		c=s.next().charAt(0);
	//	System.out.print(" ");
		b=s.nextInt();
		switch(c){
			case '/':
				System.out.print(a / b);
				break;
			case '%':
				System.out.print(a % b);
				break;
	               	}
		
		
	}
}
