package ArrayLearning;

import java.util.HashMap;

import collections.HashMapExample;

public class PrintRepeatStringChar {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Muutthuu";

		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		for (int i = 0; i < str.length(); i++) {
		char c=	str.charAt(i);
		if(hm.get(c)!=null) 
		{
			hm.put(str, null);
		}
		else {
			
		}
		}
			
	}

}
