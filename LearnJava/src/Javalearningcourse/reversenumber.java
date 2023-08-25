package Javalearningcourse;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int givennumber =113;
			/*
			 * int reversenumber = 0;
			 * 
			 * // scanner System.out.println("enter ur num: "); Scanner scanner = new
			 * Scanner(System.in); givennumber=scanner.nextInt();
			 * 
			 * while(givennumber!=0) { reversenumber= reversenumber*10+givennumber%10;
			 * givennumber= givennumber/10;
			 * 
			 * 
			 * } System.out.println(reversenumber);
			 */
				
				StringBuffer sb=new StringBuffer(String.valueOf(givennumber));
				StringBuffer reverse= sb.reverse();
				System.out.println(reverse);
	}

}
