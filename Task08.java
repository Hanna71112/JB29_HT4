package by.htp.les06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов. 

 

public class Task08 {
	public static void main(String[] args) {

int n;
n = enterFromConsole();

double[] array = new double[n];
int polozh = 0;
		for (int i=0; i < array.length; i++) {
			 array[i] = ((Math.random() * 2)-1);
			    System.out.print(array[i]+ ","); }
		result(array);
	
	
	
		
	}
		
	
	
	
		public static void result(double[] array) {
		
			int otric = 0;
			int polozh = 0;
			int nul = 0;
		
	        for(int i = 0; i<array.length; i++) {
	        	        	
	            if(array[i] >0) {
	               polozh++;   	            }
	          
	            if(array[i] <0) {
                	otric++;
                
        }
	            if(array[i] ==0) {
                	nul++;
                	
        }
	       
	        		
			}
	        System.out.println("otric = " + otric); 
	        System.out.println("nul = " + nul); 
	  	  System.out.print("polozh = " + polozh); 
	    	
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
