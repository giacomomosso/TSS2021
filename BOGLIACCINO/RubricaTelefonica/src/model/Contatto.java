package model;

public class Contatto {
	private String nome;
	private String nomeTel;
	
	public Contatto(String nome, String nomeTel) {
		super();
		this.nome = nome;
		this.nomeTel = nomeTel;
	}
	
	@Override
	public String toString() {
		return "Contatto :" + nome + " , " + nomeTel+"; ";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeTel() {
		return nomeTel;
	}
	public void setNomeTel(String nomeTel) {
		this.nomeTel = nomeTel;
	}

}
