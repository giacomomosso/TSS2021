package view;

import model.Studente;

// new random 1-10000 x time until result is 5 then display attempts

public class CercaNumero {
	
	public static void main(String[] args) {
		int tentativi = 0; int randomNumber = 0;
		
		while(randomNumber!=10000) {
			randomNumber = (int)(Math.random()*10000 +1);
			System.out.println("result "+randomNumber+" attempt nr "+tentativi);
			tentativi++;
		}
		
		
		
	}

}
