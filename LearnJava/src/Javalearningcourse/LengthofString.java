package Javalearningcourse;

public class LengthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String myname ="muthuprabhakar";

	//System.out.println(myname.length());// with string function
	char[]charArray=myname.toCharArray();
	int count=0;
	for (char mynames : charArray) {
		count++;

	}
	System.out.println("The total count is "+count);
	}

}
