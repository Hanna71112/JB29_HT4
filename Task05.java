package by.htp.les06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности. 
//Если таких чисел нет, то вывести сообщение об этом факте. 
 

public class Task05 {
	public static void main(String[] args) {

int n;
n = enterFromConsole();
int a =0;
int[] array = new int[n];

		for (int i=0; i < array.length; i++) {
			 array[i] = ((int)(Math.random() * 10)+1);
			    System.out.print(array[i]+ ","); }
		int[] mas = result(array);
		System.out.println(Arrays.toString(mas));
		
	
	}
	
		public static int[] result(int[] array) {
			int a = 0;
			int k=0;
			//int mas [] = new int[k];
	        for(int i = 0; i<array.length; i++) {
	        	        	
	            if(array[i] % 2 == 0) 
	            {
	          
	              k++; 
	            
	             
	        }}
	        
	    	int mas [] = new int[k];
			k = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 == 0) {

					  mas[k]=array[i];
					k++ ;
				}
				
			}
			return mas;
	    	
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
