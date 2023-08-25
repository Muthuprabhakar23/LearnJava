package Javalearningcourse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findSmalledtNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] givenarray = {4,7,4,1,6,9};
		/*
		 * Arrays.sort(givenarray); System.out.println(givenarray[0]);
		 */

		//Using collections
	List<Integer> list =Arrays.asList(givenarray);
	Collections.sort(list);
	System.out.println(givenarray[2]);

	}

}
