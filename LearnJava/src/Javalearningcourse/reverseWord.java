package Javalearningcourse;

public class reverseWord {

	private static final int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String name= "i love india";
  String reversed="";

String[] temp=	name.split(" ");
  System.out.println(temp.length);
  System.out.println(temp[0]);
  System.out.println(temp[1]);
  System.out.println(temp[2]);
 for(int i=temp.length-1;i>=0;i--) {
	 reversed= reversed+temp[i]+" ";
 }

 System.out.println(reversed);
	}}