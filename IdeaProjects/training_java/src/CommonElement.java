package Company;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElement {
	public static void printCommonELement(ArrayList<Integer> arr1, ArrayList<Integer>arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr1.size();i++) {
			map.put(arr1.get(i), 1);
		}
		for(int i=0;i<arr2.size();i++) {
			if(map.containsKey(arr2.get(i))) {
				System.out.println(arr2.get(i));
			}
		}
	}
}
