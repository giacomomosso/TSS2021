package test;

import java.util.Scanner;

public class TuttiUguali {
	
	public static void checkNumeri(Integer[] input) {
		String result = "sono tutti uguali";
		for(int i = 0; i<input.length;i++) {
			for(int j = 0; j<input.length;j++) {
				if(!input[i].equals(input[j])) {
					result = "almeno uno è diverso";
				}
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Integer[] dati = new Integer[3];
		Scanner input = new Scanner(System.in);
		
		System.out.println("inserisci 3 numeri");
		for(int i = 0; i<dati.length;i++) dati[i] = input.nextInt();
		
		checkNumeri(dati);
	}

}
