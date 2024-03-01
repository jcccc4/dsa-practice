package exercise;

public class CountUniqueValues {
	public static int counUniqueValues(int[] arr) {
		int firstPointer = 0;
		int secondPointer = 1;
		
		
		while (secondPointer <arr.length) {
			// if it is the same as the first pointer continue and do nothing
			// if it is different move the first pointer by one and copy the 2nd pointer
			// value and put it for the 1st pointer before moving the second
			if (arr[firstPointer] != arr[secondPointer]) {
				
				arr[++firstPointer] = arr[secondPointer];
			}
			// the index of the 1st pointer plus one will be the answer
			secondPointer++;
		}
		return ++firstPointer;
	}
}
