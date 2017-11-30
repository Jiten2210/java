package Programming;
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* EDIT DISTANCE */
 public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str1="kireet";
		String str2="ireetk";
		System.out.println(" No.of edits is "+editDist(str1,str2));
		str1="SUNDAY";
		str2="SATURDAY";
		System.out.println(" No.of edits is "+editDist(str1,str2));
	}
	static int editDist(String str1,String str2)
	{
		String big="";
		String small="";
		int ins=0,del=0,modify=0,matchingchars=0;

		if(str1.length()<str2.length())
		{
			big=str2;
			small=str1;
			ins=big.length()-small.length();
		}
		else
		{
			big=str1;
			small=str2;
			del=big.length()-small.length();
		}
		for(int i=0;i<small.length();i++)
		{
			if(big.indexOf(small.charAt(i))>-1)
			{
				matchingchars++;
			}
		}
		modify=small.length()-matchingchars;
		System.out.println("insert = "+ins+" delete = "+del+" modify = "+modify);
		return ins+del+modify;
	}
}