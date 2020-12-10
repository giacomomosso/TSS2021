package controller;

import java.util.ArrayList;

import model.Product;

public class ShoppingChart {

	private ArrayList<Product> contenitore;

	public ShoppingChart() {
		this.contenitore = new ArrayList<>();
	}
	
	public void aggiungiAlCarrello(Product p) {
		this.contenitore.add(p);
	}

	public ArrayList<Product> getContenitore() {
		return contenitore;
	}
	
	public double calcolaPrezzo() {
		double prezzo = 0;
		
		for (Product p : contenitore) {
			prezzo += p.getPrezzo();
		}
		
		return prezzo;
	}
	
}