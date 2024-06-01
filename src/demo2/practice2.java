package demo2;

import java.util.HashMap;

public class practice2 {
	public static void main(String[] args) {
		System.out.println("test");
		System.out.println("GetHub Lecture 2...");

		String str = "jjaavvaaY";
		char strArr[] = str.toCharArray();
		HashMap<Character, Integer> strMap = new HashMap<Character, Integer>();
		for (int i = 0; i < strArr.length; i++) {
			char key = strArr[i];
			if (!strMap.containsKey(key)) {
				strMap.put(key, 1);
			} else {
				int currentValue = strMap.get(key);
				int updatedValue = currentValue + 1;
				strMap.put(key, updatedValue);
			}
		}

		System.out.println(strMap);

	}
}
