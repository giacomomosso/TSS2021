package test;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci una serie di numeri");
		int dato,valorePrecedente = 0;
		boolean cicla = true;
		while(cicla){
			dato = input.nextInt();
			if (dato==0) cicla = false;
			else if (dato>= 0 && valorePrecedente < 0) System.out.println("OK");
			else System.out.println("NO");
			
			valorePrecedente = dato;
		}
		
	}

}
