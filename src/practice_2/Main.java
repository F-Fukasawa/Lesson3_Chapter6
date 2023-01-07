package practice_2;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1); // OK
		set.add(2);
		set.add(100);
		//set.add("Two"); // コンパイルエラー
		for (Integer i : set) {
			Integer i2 = i;
			System.out.println(i2);
		}

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro"); // OK
		map.put(2, "Hanako"); // OK
		//int value = map.get(0); // コンパイルエラー
		String value = map.get(0);
		System.out.println(value);
		value = map.get(1);
		System.out.println(value);
	}
}
