package Javalearningcourse;

import java.util.Scanner;

public class FidMyPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ASCII VALUE --> 97-a, A->65

		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter your character : ");

		//char c ='g';
		char givenchar = scanner.next().charAt(0);
		givenchar=	Character.toLowerCase(givenchar);
		int asciivalue =givenchar;
		int position=asciivalue-96;
		System.out.println(position);

	}

}
