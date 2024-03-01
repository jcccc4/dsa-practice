package exercise;

import java.util.HashMap;

public class ValidAnagram {

	public static boolean isValidAnagram(String first, String second) {
		// I need to validate if it has the same character with the same number of
		// frequency
		// Ex. isValidAnagram("cat","tac") returns true
		// also I need String should have the same length
		if (first.equals(second)) {
			return false;
		}
		// create an Hashmap that have Character for single char and Integer for its
		// frequency
		// Ex {c:1,a:1,t:1}
		HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
		for (char value : first.toCharArray()) {
			frequency.putIfAbsent(value, 0);
			frequency.put(value, frequency.get(value) + 1);
		}
		// I need to compare if it has the same frequency as the other
		char[]secondArray = second.toCharArray();
		for(int index = 0;index<second.length();index++) {
			char letter = secondArray[index];
			int num = frequency.getOrDefault(letter, 0);
			if(num <= 0) {
				return false;
			}
			frequency.put(letter, frequency.getOrDefault(letter, 0)-1);
		}
		
		return true;
	}
}
