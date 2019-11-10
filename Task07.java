package by.htp.les06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
//Подсчитать количество замен. 

 

public class Task07 {
	public static void main(String[] args) {

int n;
n = enterFromConsole();

int[] array = new int[n];

		for (int i=0; i < array.length; i++) {
			 array[i] = ((int)(Math.random() * 10)+1);
			    System.out.print(array[i]+ ","); }
		int count = result(array);
		System.out.print("count = " + count); }
		
	
	
	
		public static int result(int[] array) {
			int Z =5;
			int count = 0;
		
	        for(int i = 0; i<array.length; i++) {
	        	        	
	            if(array[i] >Z) {
	            	array[i] = Z;
	            	count++;
	            }
	       
				
			}
			return count;
	    	
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
