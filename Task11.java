package by.htp.les06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
//Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1)

public class Task11 {
	public static void main(String[] args) {

		int n;
		n = enterFromConsole();

		int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
			array[i] = ((int)(Math.random() * 100) - 1);
			System.out.print(array[i] + ",");
		}
		result(array);
			}

	public static void result(int[] array) {
int a =0;
		int L = 2;
int M = 6;
		for (int i = 0; i < array.length; i++) {

			if (array[i] % M ==L) {
				a = array[i];
				System.out.println("a = "+a);
			}
						}
	
            
        
		

	}

	public static int enterFromConsole() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		while (!sc.hasNextInt()) {
			System.out.print(">");
			sc.next();
		}
		n = sc.nextInt();
		return n;
	}
}
