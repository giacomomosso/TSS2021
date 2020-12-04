package model;

public class Dipendente {
	private static int contatore = 0;
	private int nMatricola;
	private String nome;
	private String ruolo;
	
	public Dipendente(String nome, String ruolo){
		this.nome = nome;
		this.ruolo = ruolo;
		contatore++;
		this.nMatricola = contatore;
	}
	
}
