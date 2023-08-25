package Javalearningcourse;

public class LeadingandTrailing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= " Muthu prabhakar ";

		System.out.println(name.trim());

	
		System.out.println(name.replaceAll("^[ \t]+|[ \t]+$", ""));
		System.out.println(name.replaceAll("^[ \t]", ""));
		System.out.println(name.replaceAll("[ \t]+$", ""));

	}

}
