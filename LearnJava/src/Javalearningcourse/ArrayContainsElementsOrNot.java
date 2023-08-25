package Javalearningcourse;

public class ArrayContainsElementsOrNot {
	//Scanner scanner = new scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,2,3,4,5};
	int numbertofind=5;


		boolean found=false;
		for (int number : array) {
		if (number==numbertofind) {
			found=true;
			break;
		}}
		if (found) {
				System.out.println("Number is present ");

		} else {
System.out.println("Number is not present ");
		}


		}
	}


