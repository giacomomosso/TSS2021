package view;

import java.io.IOException;
import java.util.Scanner;

public class MorraCinese {
	
	String[] mosse = {"sasso","carta","forbice"};
	public Scanner input = new Scanner(System.in);
	public String player;
	public String AI;
	public int score;
	
	public void userTurn() {
		
		System.out.println("scegli opzione tra sasso, carta, forbice");
		String user_input = input.next();
		catchInputError(user_input);
	}
	
	public void catchInputError(String s){
		 boolean error = true;
		for(String i:mosse){
			if(s.equals(i)) error = false;
		}
		while(error) {
			System.out.println("hai inserito un valore non valido \n");
			userTurn();
		}
		player = s;
	}
	
	public void aiTurn(){
		double random = Math.random()*3;
		AI = mosse[(int)random];
		System.out.println(AI);
	}
	public void resolve() {
		if(player.equals(AI)) System.out.println("pareggio"); this.score++;
		System.out.println("lo score e "+this.score);
		// game logic here
	}
	
	public void play(int score) {
		while(this.score < score) {
			this.userTurn();
			this.aiTurn();
			this.resolve();
		}
		try {
			Runtime.getRuntime().exec("cls");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		MorraCinese partita = new MorraCinese();
		partita.play(3);
	}

}
