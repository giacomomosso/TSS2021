package view;
import controller.ShoppingChart;
import controller.Warehouse;

import java.util.Scanner;

import controller.Products;
import model.Product;
public class App {

	public static void main(String[] args) {
		
		Products negozio1 = new Products();
		ShoppingChart utente1 = new ShoppingChart();
		Product item;
		boolean session = true;
		
		while(session) {
			System.out.println("Benvenuto al bennet, premi: ");
			System.out.println("-1 visualizza i prodotti disponibili");
			System.out.println("-2 ordinare un prodotto e la quanità");
			System.out.println("-3 visualizzare il costo della spesa");
			System.out.println("-4 acquista");
			System.out.println("-5 annulla");

			Scanner input = new Scanner(System.in);
			
			Integer switchOptions = input.nextInt();
			
			switch(switchOptions) {
				case 1 :
					for (Product p : negozio1.getMagazzino()) {
						System.out.println(p);
					}
					break;
				case 2 :
					System.out.println("seleziona il prodotto che ti interessa con il codice prodotto");
					Scanner inputProduct = new Scanner(System.in);
					Integer codprodotto = input.nextInt();
					for (Product p : Warehouse.getAll()) {
						if(p.getCodProdotto() == codprodotto){
							item = p;
							System.out.println("seleziona la quantita");
							Scanner inputQuantity = new Scanner(System.in);
							Integer quantita = input.nextInt();
							for (int i = 0; i<quantita;i++){
								utente1.aggiungiAlCarrello(item);
							}	
						}
					}
					break;
				case 3 :
					System.out.println("Il ShoppingCharts contiene");
					for (Product p : utente1.getContenitore()) {
						System.out.println(p);
					}
					System.out.println("Prezzo totale: " + utente1.calcolaPrezzo());
					break;
				case 4 :
					System.out.println("grazie per aver acquistato");
					session = false;
					break;
				case 5 :
					System.out.println("tutte le operaizoni sono state annullate");
					session = false;
					break;
				default: 
					System.out.println("hai inserito valori non validi");
					break;
					
			}
		}
	}
}
