package Javalearningcourse;

import java.util.Arrays;
import java.util.HashSet;



public class missingAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String given="ABC";
given=given.toLowerCase();
given=given.replaceAll(" ", "");
String[] userArray=given.split("");
	String[] alphabets= "abcdefghijklmnopqrstuvyxyz".split("");
		HashSet<String> set1=new HashSet<>(Arrays.asList(userArray));
		HashSet<String> set2=new HashSet<>(Arrays.asList(alphabets));
		set2.removeAll(set1);
		System.out.println(set2);

	}}