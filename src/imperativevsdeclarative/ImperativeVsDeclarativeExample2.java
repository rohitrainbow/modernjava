package imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String args[]) {
		/*
		 * Imperative Style
		 **/

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 8, 9, 10, 3, 4, 5);
		List<Integer> uniqueList = new ArrayList<Integer>();
		for (Integer input : integerList) {
			if (!uniqueList.contains(input)) {
				uniqueList.add(input);
			}
		}
		System.out.println(uniqueList);
		System.out.println(integerList.stream().distinct().collect(Collectors.toList()));
	}
}
