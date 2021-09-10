package practice;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "AABBCDCE";
		char chk = ' ';
		boolean found = false;
		for (int i = 0; i < test.length(); i++) {
			chk = test.charAt(i);
			for (int j = 0; j < test.length(); j++) {
				if (chk == test.charAt(j) && i != j) {
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println(chk);
				break;
			}
			found = false;
		}
	}

}
