package com.sk.Pattern;

public class TestFor0And1 {

	public static void main(String[] args) {
//               1010101
//               0101010
//               1010101
//               0101010

		int row = 7;
		// outer loop
		for (int i = 1; i <= row; i++) {
			int flag;
			// inner loop for even
			if (i % 2 == 0) {
				flag = 0;
				for (int j = 1; j <= row; j++) {
					System.out.print(flag);
					flag = flag == 0 ? 1 : 0;
				}
			} else {
				flag = 1;
				for (int j = 1; j <= row; j++) {
					System.out.print(flag);
					flag = flag == 0 ? 1 : 0;
				}

			}
			System.out.println();
		}

	}
}
