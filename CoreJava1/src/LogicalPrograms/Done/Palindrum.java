package LogicalPrograms.Done;

public class Palindrum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";
		String pal = "";

		System.out.println(str.length());
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			pal = pal + c;

		}
		System.out.println(pal);

	}

}
