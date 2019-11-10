package by.htp.les06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
// . Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей. 

public class Task04 {
	public static void main(String[] args) {
int n;
n = enterFromConsole();

double[] array = new double[n];
	boolean f = true;
		for (int i=0; i < array.length; i++) {
			 array[i] = Math.random();
			    System.out.print(array[i]+ ","); }
		f = result(array);
		if (f == true)
		{
			System.out.println("vozr");
		}
		}
	
		public static boolean result(double[] array) {
	        for(int i = 0; i<array.length-1; i++) {
	            if(array[i] > array[i+1]) {
	                return false;
	            }
	        }
	        return true;
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
