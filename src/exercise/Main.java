package exercise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		System.out.println(sameFrequency(1822,2821));
	}
	
	public static boolean sameFrequency(int x, int y) {
		//would modulo by 10 to get the remainder
		//add a Hashmap would determine the number of repeating
		//use Math floor to remove the last digit
		//repeat it on both side
		//compare
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		List<Integer> result = arr.stream().map(item-> item*item).collect(Collectors.toList());
		System.out.println(result);
		
		HashMap<Integer, Integer> test1 = new HashMap<>();
		HashMap<Integer, Integer> test2 = new HashMap<>();
		while(x>0) {
			int num = x%10;
			test1.putIfAbsent(num, 0);
			test1.put(num, test1.get(num)+1);
			x=Math.floorDiv(x, 10);		
		}
		
		while(y>0) {
			int num = y%10;
			test2.putIfAbsent(num, 0);
			test2.put(num, test2.get(num)+1);
			y=Math.floorDiv(y, 10);		
		}
		
		
		for(int key:test1.keySet()) {
			if(test1.get(key)!= test2.get(key)) {
				return false;
			}
		}
			
		
		return true;
	}

}
