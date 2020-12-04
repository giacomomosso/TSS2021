package test;

import java.util.Scanner;

public class SoloVocali {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String stringa;
	
		System.out.println("inserisci una frase");
		stringa = input.next();
		stringa = stringa.replaceAll("[a-z&&[^aeiou]]","");
		System.out.println("solovocali.java -> "+stringa);
	}

}
