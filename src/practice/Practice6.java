package practice;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalStr = sc.nextInt();
		String inputString[] = new String[totalStr];
		for (int i = 0; i < totalStr; i++) {
			inputString[i] = sc.next();
		}
		for (int j = 0; j < totalStr; j++) {
			String s = inputString[j];
			Integer sumO = 0;
			Integer sumE = 0;
			for (int i = 0; i < s.length(); i++) {
				if ((i + 1) % 2 != 0)
					sumO += s.charAt(i);
				else
					sumE += s.charAt(i);
			}
			// 2,3,5,7
			Integer diff = sumE - sumO;
			if (diff % 3 == 0 || diff % 5 == 0 || diff % 7 == 0)
				System.out.println("Casual String");
			else
				System.out.println("Prime String");
		}
		sc.close();
	}

}
