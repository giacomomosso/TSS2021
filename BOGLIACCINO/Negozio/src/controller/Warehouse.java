package controller;

import model.Product;

public class Warehouse {

	public static Product[] getAll() {
		
		Product[] array = {
			new Product(1, "Pasta", 0.85),	
			new Product(2, "Riso", 1.85),	
			new Product(3, "Biscotti", 1.15),	
			new Product(4, "Latte", 1.55),	
			new Product(5, "Pane", 1.99),	
			new Product(6, "Vino", 2.85),	
			new Product(7, "Sale", 0.85),	
			new Product(8, "Pepe", 0.95),	
			new Product(9, "Grissini", 1.35),	
			new Product(10, "Mele", 1.05),	
		};
		
		return array;
	}
	
	
}