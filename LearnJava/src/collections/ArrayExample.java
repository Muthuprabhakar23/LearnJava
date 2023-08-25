package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  ArrayList<Integer> arraylist= new ArrayList<Integer>(); arraylist.add(1);
//		  arraylist.add(2); arraylist.add(3); arraylist.add(4); arraylist.add(5);
//		  arraylist.add(6);
//		  
//		  arraylist.remove(5); System.out.println(arraylist); arraylist.add(8);
//		  System.out.println(arraylist); ArrayList anotherlist= new ArrayList<>();
//		  anotherlist.addAll(arraylist); System.out.println(anotherlist);
//		  anotherlist.set(5, 9); System.out.println(anotherlist); anotherlist.clear();
//		  System.out.println(anotherlist); int count =arraylist.size();
//		  System.out.println(count);
//		 
		
		  ArrayList<String> cars = new ArrayList<String>();
		    cars.add("ba");
		    cars.add("a");
		    cars.add("ad");
		    cars.add("da");
		  Collections.sort(cars);
		  for (String string : cars) {
			  System.out.println(string);
			
		}
				}
			}
		


