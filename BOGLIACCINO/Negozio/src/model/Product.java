package model;

public class Product {

	private int codProdotto;
	private String descrizione;
	private double prezzo;

	public Product(int codProdotto, String descrizione, double prezzo) {
		this.codProdotto = codProdotto;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	public int getCodProdotto() {
		return codProdotto;
	}
	public void setCodProdotto(int codProdotto) {
		this.codProdotto = codProdotto;
	}
	public String getDescrizione() {
		return descrizione.toUpperCase();
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "" + this.codProdotto + ", " + this.getDescrizione() + ", " + this.prezzo + "";
	}
}
	