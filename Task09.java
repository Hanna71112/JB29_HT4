package by.htp.les06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
//. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы. 

public class Task09 {
	public static void main(String[] args) {

		int n;
		n = enterFromConsole();

		double[] array = new double[n];
		int polozh = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = ((Math.random() * 2) - 1);
			System.out.println(array[i] + ",");
		}
		result(array);
		
		//System.out.println(Arrays.toString(array));
	}

	public static void result(double[] array) {

		double max = 0;
		double min = 0;
int pmax = 0;
int pmin = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
				pmax = i;
			}
			if (array[i] < max) {
				min = array[i];
				pmin = i; 
			}
				}
		
	    array[pmin] = max;
        array[pmax] = min;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
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
