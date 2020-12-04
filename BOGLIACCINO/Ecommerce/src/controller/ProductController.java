package controller;

import model.Product;

public class ProductController {
	
	private Product[] productDatabase;

	public ProductController() {
		super();
		this.productDatabase = Warehouse.getProductData();
	}
}
