package Execption;

public class MyApplication {
	public static void main(String[] args) {
		try {
			String test=null;
			test.getClass();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}

	}
}
