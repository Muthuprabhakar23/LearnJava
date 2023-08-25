package Javalearningcourse;

public class ReplaceVowlesWithSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="i miss mahi";
	char [] chararray=	input.toCharArray();
	for(int i=0; i<input.length();i++) {
		if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
		chararray[i]='*';
		//System.out.println(chararray);
	}
	for(int i=0; i<input.length();i++) {
		System.out.print(chararray[i]);
	}
	//WAY 2 Solve this program
	// regular expression
//--------------------------------------------------------------------------------------------------
	//String replacedtext=input.replaceAll("[AEIOUaeiou]", "\\$");
	//System.out.println(replacedtext);
	}


}
