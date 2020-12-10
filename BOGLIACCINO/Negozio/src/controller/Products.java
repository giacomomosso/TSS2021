package controller;

import model.Product;

public class Products {

	private Product[] magazzino;
	
	public Products() {
		this.magazzino = Warehouse.getAll();
	}

	public Product[] getMagazzino() {
		return magazzino;
	}
	
}