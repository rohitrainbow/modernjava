package practice;

public class Practice4 {
	private static Practice4 obj = null;

	private Practice4() {
	}

	public static Practice4 getInstance() {
		if (obj == null)
			obj = new Practice4();
		return obj;
	}
	

}
