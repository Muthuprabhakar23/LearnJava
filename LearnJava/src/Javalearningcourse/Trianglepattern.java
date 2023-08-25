package Javalearningcourse;

import java.util.Scanner;

public class Trianglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("enter the numb :");
		 *
		 * int numberoflines = scanner.nextInt(2);// with and without radix int
		 * row,column=0; for(row=0;row<numberoflines;row++) {
		 *
		 * for (column=0;column<=row;column++) { System.out.print("*"); }
		 * System.out.println(); }
		 */


		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your number ");
		int startingvalue =3;
		int limit;
		limit=scanner.nextInt();
		int row,column;
		for(row=0;row<limit;row++) {

			for(column=0;column<=row;column++) {
				System.out.print(startingvalue);

				startingvalue=startingvalue+1;


			}
			System.out.println();
		}


	}}

