package LogicalPrograms.Done;

import java.util.ArrayList;
import java.util.Arrays;

public final class Febanacci {

	static void febmeth() {

		int n1 = 0, n2 = 1, n3 = 0;
		int[] ar = new int[9];
		ArrayList al = new ArrayList();

		for (int i = 1; i < 8; ++i) {
			// ar[8]=n1;
			al.add(n1);
			System.out.print(n1);
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

		}
		System.out.print(al);

	}

	/**
	 * @param args
	 *            [0,1,1,2,4,8]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		febmeth();
	}

}
