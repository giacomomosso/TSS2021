package view;

import java.util.Scanner;

import control.Rubrica;


public class Gestione {

	public static void main(String[] args) {
		
		Rubrica Elenco = new Rubrica();
		boolean run = true;
		Scanner input = new Scanner(System.in);
		
		
		while(run) {
			
			System.out.println("azioni: \n 1) aggiungi contatti \n 2) vedi contatti \n 3) trova contatto \n 4) esci");
			Integer switchOptions = input.nextInt();

			switch(switchOptions) {
				case 1 :
					System.out.println("inserisci il nome");
					String name = input.next();
					System.out.println("inserisci il numero di telefono");
					String number = input.next();
					Elenco.aggiungi(name, number);
					break;
				case 2 :
					System.out.println(Elenco.getElenco());
			
					break;
				case 3 :
					System.out.println("inserisci il nome");
					String search = input.next();
					System.out.println(Elenco.getContatto(search));
					break;
				case 4 :
					System.out.println("grazie per aver usato il nostro sistema");
					
					break;
				default: 
					System.out.println("hai inserito valori non validi");
					break;
					
			}
		}

	}
}
