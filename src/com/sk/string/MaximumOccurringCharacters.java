package com.sk.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaximumOccurringCharacters {
	public static void byJava8(String str) {

	//	List<String> list = Arrays.asList("1", "1", "1", "1", "1", "1", "5", "5", "12", "12", "12", "12", "12", "12",
		//		"12", "12", "12", "12", "8");
	//	List<char[]> asList = Arrays.asList(str.toCharArray());
		
		//  here we use chars() to convert char[] arr
		     //           str.chars().boxed().collect(Collectors.summarizingInt(() -> ));
		Map<Integer, Long> collect = str.chars().boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
            System.out.println(collect);
		Optional<Integer> findFirst = collect.entrySet().stream()
				.sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).map(i -> i.getKey()).findFirst();
		System.out.println(findFirst);
	}

	public static void shortUsringHashSet(String input) {

		HashMap<Character, Integer> map = new HashMap<>();
		int max = 0;
		char maxChar = '\u0000';
		for (Character ch : input.toCharArray()) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
			if (max < map.get(ch)) {
				max = map.get(ch);
				maxChar = ch;
			}

		}
		System.out.println(maxChar + " Max " + max);

	}

	public static void shortCountOccurring(String input) {
		// outer loop for get one by one char
		int max = 0;
		char maxChar = '\u0000';
		for (char outCh : input.toCharArray()) {
			int count = 0;
			// inner loop for count occurring char
			for (char inCh : input.toCharArray()) {
				if (outCh == inCh)
					count++;
			}
			// condition for get max
			if (max < count) {
				max = count;
				// if we want that character also then
				maxChar = outCh;
			}
		}
		System.out.print(max + "  " + maxChar);
	}

	public static void countOccurring(String input) {
		// String input = "geeksforgeeks";
		int max = 0;
		char maxCh = '\u0000';
		for (char c : input.toCharArray()) {
			int count = 0;
			// stop loop
			if (input == "") {
				break;
			}
			for (char ch : input.toCharArray()) {
				if (c == ch) {
					count++;
				}
			}
			System.out.println(c + "  " + count);
			// logic for find max occurence

			if (max < count) {
				max = count;
				maxCh = c;

			}

			// here we need to remove that character form string
			for (char rch : input.toCharArray()) {
				if (c == rch) {
					int indexOf = input.indexOf(rch);
					// if(indexOf==0) input=input.substring(1);
					input = input.substring(0, indexOf) + input.substring(indexOf + 1, input.length());

				}
			}
		}
		System.out.println("  ==========");
		System.out.println("Max char is :" + maxCh);
		System.out.println("  ==========");

		return;

	}

	public static void main(String[] args) {

		// maximum Occurring Characters
		String input = "ppprrrer";
		// countOccurring(input);
		// shortCountOccurring(input);
//		shortUsringHashSet(input);
		 byJava8(input);
		// we need to get list of occurring characters
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : input.toCharArray()) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}

		// System.out.println(map);
		// we get the max value key

		// OptionalInt max = map.entrySet().stream().map(k -> k.getValue()).mapToInt(i
		// -> i).max();
		// System.out.println(max.getAsInt());
		// sorting based on the value

		Character character = map.entrySet().stream().sorted((o1, o2) -> -o1.getValue().compareTo(o2.getValue()))
				.map(e -> e.getKey()).findFirst().get();

		// System.out.println(character);
		// if we want list then

		List<Entry<Character, Integer>> list1 = map.entrySet().stream()
				.sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).collect(Collectors.toList());
		// System.out.println(list);
		// map.entrySet().Map.Entry...

	}
}
