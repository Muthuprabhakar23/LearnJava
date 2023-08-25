package ArrayLearning;

import java.util.Iterator;

public class learningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int[]a={10,12,20}; int[]b= {4,12}; int len=a.length+b.length; int[]c=new
		 * int[len]; for (int i = 0; i < a.length; i++) { c[i]=a[i]; } int j=0; for (int
		 * i =a.length; i < c.length; i++) { c[i]=b[j]; } for (int i = 0; i < c.length;
		 * i++) { System.out.println(c[i]); } //System.out.println(c);
		 */	
		 Integer[] arr = {10,2,5,10,6,100,10,};
	        printDuplicateElementsUsingNestedLoops(arr);
	    }

	    public static void printDuplicateElementsUsingNestedLoops(Integer[] arr) {
	        System.out.println("Duplicate Elements:");

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i+1; j < arr.length;j++ ) {
	                if (arr[i].equals(arr[j])) {
	                    System.out.println(arr[i]);
	                     // To avoid printing the same element multiple times
	                }
	            }
	        }
	}

}
