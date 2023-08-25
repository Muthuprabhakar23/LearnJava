package javaimportantprogram;

import java.util.Scanner;

public class fibbonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the number of terms in the Fibonacci series: ");
		Scanner scanner = new Scanner(System.in);
int num=scanner.nextInt();
int n=0;
int n1=1;
System.out.print("Fibonacci Series (" + num + " terms): ");
for(int i =0; i<=num;i++) {
System.out.println(n);
int sum= n+n1;
n=n1;
n1=sum;
}

	}

}
