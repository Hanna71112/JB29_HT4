package by.htp.les06;

import java.util.Arrays;

// В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов
public class Task02 {
	public static void main(String[] args) {
		int[] A = new int[] { 0, 10, 0, 0, 2 };
	
		int[] B = nul(A);
		System.out.println(Arrays.toString(B));

	}

	public static int[] nul(int[] A) {

		int count = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {

			count ++;
			}

		}
		
		int B [] = new int[count];
		count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {

				B[count] = i;
				count ++;
			}
		}

		return B;
	}
}
