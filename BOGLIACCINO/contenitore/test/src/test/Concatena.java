package test;

import java.util.Scanner;

public class Concatena {
	
	public static String concatena (String[] input) {
		String result ="";
		
		for(int i=0; i<input.length; i++) {
			result += input[i]+"*";
		}
		
		result = result.substring(0, result.length() - 1);
		
		return result;
	}

	public static void main(String[] args) {
		String[] dati = new String[3];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			System.out.println("inserisci una parola");
			dati[i] = input.next();
		}
		
		System.out.println(concatena(dati));
		
	}

}
