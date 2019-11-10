package by.htp.les06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
// Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа
 

public class Task06 {
	public static void main(String[] args) {

int n;
n = enterFromConsole();
int a =0;
int[] array = new int[n];

		for (int i=0; i < array.length; i++) {
			 array[i] = ((int)(Math.random() * 10)+1);
			    System.out.print(array[i]+ ","); }
		int res = result(array);
		System.out.print("res = " + res); }
		
	
	
	
		public static int result(int[] array) {
			int max = 0;
			int min = 0;
			int res = 0;
		
	        for(int i = 0; i<array.length; i++) {
	        	        	
	            if(array[i] >max) {
	            	max = array[i];
	            }
	            if(array[i] <max) {
	            	min = array[i];
	            }
	         res = max-min;
				
			}
			return res;
	    	
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
