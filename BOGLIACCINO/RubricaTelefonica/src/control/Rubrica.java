package control;
import java.util.ArrayList;

import model.Contatto;

public class Rubrica {
	
	private ArrayList<Contatto> Elenco = new ArrayList<Contatto>();


	public Rubrica() {
		super();
	}

	public ArrayList<Contatto> getElenco() {
		return Elenco;
	}
	 
	public ArrayList<Contatto> getContatto(String input){
	 ArrayList<Contatto> result = new ArrayList<Contatto>();
	 for (Contatto x : Elenco) {
		 if(x.getNome().contains(input)){
			 result.add(x);
		 }
		 else {
			// System.out.println(x.getNome().contains(input));
		 }
	 }
	 return result;
	}

	public void aggiungi(String name, String numtel) {
		Contatto input = new Contatto(name, numtel);
		Elenco.add(input);
	}
	
	@Override
	public String toString() {
		int size = this.Elenco.size();
		return "Rubrica contiene " + size + " contatti. ";
	}
	

}
