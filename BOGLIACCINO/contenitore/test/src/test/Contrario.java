package test;

import java.util.Scanner;
import java.lang.StringBuilder;
;

public class Contrario {
	public static String invertiStringa(String input){
		return new StringBuilder(input).reverse().toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci una parola");
		System.out.println(invertiStringa(input.next()));

	}

}
