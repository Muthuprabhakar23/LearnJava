package Javalearningcourse;

public class UppercaseToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	//ASCII-> 65-90(UPPERCASE) 97-122(LOWERCASE//)
		String input ="I AM MUTHURASA";
		char[] charArray=input.toCharArray();
		for(int i =0;i<input.length();i++ ) {
			if(charArray[i]>=65&&charArray[i]<=90) {
				charArray[i]= (char) (charArray[i]+32);
			}
		}
		for(int i =0;i<input.length();i++ ) {
			System.out.print(charArray[i]);
		}
	}*/
	//to upper case

	String givenname ="my dear java";
	char[] charArray=givenname.toCharArray();
	for(int i=0;i<givenname.length();i++) {
		if(charArray[i]>=97&&charArray[i]<=122) {
			charArray[i] =(char)	(charArray[i]-32);
		}

	}

	System.out.println(charArray);
}
}