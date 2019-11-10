package by.htp.les06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i 

public class Task10 {
	public static void main(String[] args) {

		int n;
		n = enterFromConsole();

		int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
			array[i] = ((int)(Math.random() * 21) - 10);
			System.out.print(array[i] + ",");
		}
		result(array);
		
		//System.out.println(Arrays.toString(array));
	}

	public static void result(int[] array) {

		int a = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > i) {
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
