package imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

	public static void main(String args[]) {
		/**
		 * Imperative - how Style of programming
		 */

		// mutable variable
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Impertive Output :-" + sum);

		/**
		 * Declarative - what Style of programming
		 */
		int sum1 = IntStream.rangeClosed(0, 100).parallel() // splits the value
				.sum();
		System.out.println("Declarative Output :-" + sum1);
	}

}
