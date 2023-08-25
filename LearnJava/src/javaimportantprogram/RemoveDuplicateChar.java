package javaimportantprogram;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "muutthhuu";
		//String result=removeDuplicateElement(input);
		//System.out.println("result :" + result);
	}
public static String removeDuplicateElement(String input){
{
		LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
		for (char cha : input.toCharArray()) {
			boolean re=uniqueChars.add(cha);
			
		}
		StringBuilder builder =new StringBuilder();
	for (Character character : uniqueChars) {
		builder.append(character);
		
		}
              String crc=  builder.toString();
              System.out.println(crc);
	}
return input;}
}



