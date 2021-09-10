package practice;

import java.util.HashMap;
import java.util.Map;

public class Practice3 {

	public static void main(String[] args) {
		String s = "I am a java support Engineer";
		System.out.println(checkOcc(s));
	}

	public static Map<Character, Long> checkOcc(String input) {
		input = input.replaceAll(" ", "");
		long maxCount = 0;
		long count = 0;
		char finalCha = ' ';
		int length = input.length();
		for (int i = 0; i < length; i++) {
			char inp = input.charAt(i);
			count = input.chars().filter(ch -> ch == inp).count();
			if (count > maxCount) {
				maxCount = count;
				finalCha = inp;
			}
		}
		System.out.println(finalCha + " " + maxCount);

		Map<Character, Long> result;

		long highestOcc = 0;
		finalCha = 'A';
		char chr = 'A';
		maxCount = 0;
		count = 0;
		for (int i = 0; i < length; i++) {
			chr = input.charAt(i);
			count = 0;
			for (int j = 0; j < length; j++) {
				if (chr == input.charAt(j))
					count++;
			}
			if (count > highestOcc) {
				highestOcc = count;
				finalCha = chr;
			}
		}
		result = new HashMap<Character, Long>();
		result.put(finalCha, highestOcc);
		return result;
	}
}
