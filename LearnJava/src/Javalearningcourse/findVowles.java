package Javalearningcourse;

public class findVowles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inuput ="rooockstar";
		int vowlescount =0;
		inuput	=	inuput.toLowerCase();
		int length=inuput.length();
		for(int i =0; i<length;i++) {
			if(inuput.charAt(i)=='a' ||inuput.charAt(i)=='e'||inuput.charAt(i)=='i'||inuput.charAt(i)=='o'||
					inuput.charAt(i)=='u') {
				vowlescount++;

			}

		}
		System.out.println(vowlescount);

	}

}
