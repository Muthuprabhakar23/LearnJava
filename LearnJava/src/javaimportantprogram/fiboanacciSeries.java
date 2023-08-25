package javaimportantprogram;

import java.util.Scanner;

public class fiboanacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of terms in the Fibonacci series: ");
       
        int numTerms = scanner.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        
        System.out.print("Fibonacci Series (" + numTerms + " terms): ");
        
        for (int i = 0; i < numTerms; i++) {
            System.out.print(n1+" ");
            
            int sum = n1 + n2;  //0+1=1,1+1=2
            n1 = n2;//0=1,1=1
            n2 = sum;//1=1, 2=2
        }
        
     
    }
}
