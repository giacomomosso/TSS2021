package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StampaZigZag {
	
	public static Integer[] zigzagsort(Integer[] input) {
		
		Integer[] result = new Integer[input.length];
		int pari = 0;
		int dispari = input.length-1;

		for (int i = 0; i<result.length;i++) {
			
			if(i%2==0){
				result[i] = input[pari];
				pari++;
			}
			else {
				result[i] = input[dispari];
				dispari--;
			}
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		
		
		
		Integer[] dati = new Integer[10];
		Scanner input = new Scanner(System.in);
		
		System.out.println("inserisci 10 numeri");
		for(int i = 0; i<dati.length;i++) dati[i] = input.nextInt();
		Integer[] zigzagArray = zigzagsort(dati);
		
		System.out.println("finale: "+Arrays.toString(zigzagArray));
		
	}

}
