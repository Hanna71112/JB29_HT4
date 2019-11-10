package by.htp.les06;

import java.util.Arrays;
import java.util.Scanner;

// Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или отрицательное
public class Task03 {
	public static void main(String[] args) {
int n;
n = enterFromConsole();

		int[] array = new int[n];
	
		for (int i=0; i < array.length; i++) {
			 array[i] = ((int)(Math.random() * 11) - 5);
			    System.out.print(array[i]+ ","); }
		result(array);
	}
	////////
	
	public static int result(int[] array) {
		int result = 0;
				
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {

				
			}

			    
			if (array[i] >0)
			{
				System.out.print(" раньше встречается положительное");	
				break;
			}
			
			if (array[i]<0)
			{
				System.out.print(" раньше встречается отрицательное");	
				break;
			}
		
						    }	
				
		
		return result;
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
