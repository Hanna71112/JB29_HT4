package by.htp.les06;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. 
public class Task01 {
	public static void main(String[] args) {
		int[] A = new int[] { 6, 10, 20, 17 };
		float K = 5;
		float a = kratn(A, K);
	}

	public static float kratn(int[] A, float K) {
		int sum = 0;
		float a = 0;
		for (int i = 0; i < A.length; i++) {
			a = (float) (A[i] / K);
			
			if ((a * 10) % 10 == 0) {
				
			sum = A[i] + sum;
			}
		
		}
		System.out.println("sum = " + sum);
		return sum;

	}



}
