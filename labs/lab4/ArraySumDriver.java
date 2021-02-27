package Lab4;

import java.util.ArrayList;
import java.util.Arrays;


public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;
	static int []fibonacciTable = new int[ARRAY_SIZE];
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		int[] myArray = new int[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 5);
		System.out.println(sum);
		
		
		
		
		System.out.println("Table: " + Arrays.toString(fibonacciTable));
		System.out.println("Fibonacci: " + dynamicFibonacci(5));
		System.out.println("Table: " + Arrays.toString(fibonacciTable));
		
	
	}
	
	
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param i 
	 * @param  
	 * @param genericArray array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return 
	 * @return sum of array values
	 */
	public static int sumOfArray(int[] arr, int num) {
		// Implement your code here
		if(num < 0) {
			return 0;
		}
		else {
			return sumOfArray(arr, num-1) + arr[num];
		}
		  
	}
	
	
		
		
	
	public static int dynamicFibonacci(int num) {
		
		if (num == 0 || num == 1) {
			
			if(fibonacciTable[0] == 0) {
				fibonacciTable[0] = 1;
			}
			
			if(fibonacciTable[1] == 0) {
				fibonacciTable[1]= 1;
			}
			
			return fibonacciTable[num];
		}
			
		if(fibonacciTable[num] != 0) {
			return fibonacciTable[num];
		}
		if(fibonacciTable[num-1] != 0 & fibonacciTable[num-2] != 0) {
			fibonacciTable[num] = fibonacciTable[num-1] + fibonacciTable[num-2];
			return fibonacciTable[num];
		}
		else {
			fibonacciTable[num-1] = dynamicFibonacci(num-1);
			fibonacciTable[num] = fibonacciTable[num-1] + fibonacciTable[num-2];
			return fibonacciTable[num];
		}
	
	}
		

}