package Javalearningcourse;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Myname="muthu56";
int total=0;
int length=Myname.length();
for(int i=0; i<length;i++)
{
	char character=Myname.charAt(i);
	if(Character.isDigit(character)){
	total=total + Character.getNumericValue(character);
	}

}
System.out.println(total);

	}

}
