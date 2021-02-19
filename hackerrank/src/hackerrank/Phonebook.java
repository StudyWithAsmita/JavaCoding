package hackerrank;

import java.util.HashMap;

public class Phonebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap< String, Integer> phonebook = new HashMap<String, Integer>();
		phonebook.put("Asmita", 123345676);
		
		int number = 0;
		//System.out.println(number);
		
		if(phonebook.containsKey("asmitadas")) {
			 number = phonebook.get("Asmitadas");
		}
		
		System.out.println(number);

	}

}
