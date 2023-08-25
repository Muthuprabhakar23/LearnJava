package Javalearningcourse;

public class FindRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String name= "Muthuprabhakar"; char tofind='a'; int repeated=0;
		 * name=name.toLowerCase(); for(int i=0;i<name.length();i++) { if
		 * (name.charAt(i)==tofind) { repeated=repeated+1;
		 *
		 *
		 * } } System.out.println(tofind + " is present "+ repeated +" times in name");
		 */

		String name= "Muthuprabhakar";
		char tofind='a';
		name=name.toUpperCase();
	String	charToFind= Character.toString(tofind).toUpperCase();
	System.out.println(charToFind);
	int actualLength=name.length();
	System.out.println(actualLength);
	name=name.replace(charToFind, "");
	System.out.println(name);
	int lengthafterreplace=name.length();
	System.out.println(lengthafterreplace);
	int repeatedcharacter =actualLength-lengthafterreplace;
	System.out.println(repeatedcharacter);
	}

}
