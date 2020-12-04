package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FiltraArray {
	public static Integer[] FiltraArray(Integer[] input, int arraySize) {
		Integer[] result = new Integer[arraySize];
		int arrayIterator = 0;  

		for (int i= 0; i<input.length;i++) {
			if(input[i]>= 0) {
				result[arrayIterator] = input[i];
				arrayIterator++;
			}
		}
		
		return result;
	}
	
	public static int getSize (Integer[] input) {
		int result = 0;
		for (int i= 0; i<input.length;i++) {
			if(input[i]>= 0) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Integer[] sequenza = new Integer[3];
		Scanner input = new Scanner(System.in);
		Integer[] arraypositivo = {};
		
		System.out.println("inserisci un numero: ");
		for(int i = 0; i<sequenza.length;i++) sequenza[i] = input.nextInt();
		arraypositivo = FiltraArray(sequenza ,getSize(sequenza));
		Collections.reverse(Arrays.asList(arraypositivo));
		System.out.println(Arrays.toString(arraypositivo));
		
	}
		

}
