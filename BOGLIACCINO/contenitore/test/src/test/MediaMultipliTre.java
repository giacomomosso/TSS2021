package test;

import java.util.Scanner;

public class MediaMultipliTre {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valoreAttuale,sommadivisibilitre = 0,numerodadividere = 0,numeroInput = 0,result;
		
		System.out.println("quanti numeri vuoi inserire?");
		numeroInput = input.nextInt();
		
		System.out.println("inserisci "+numeroInput+" numeri");
		for(int i = 0; i<numeroInput;i++) {
			valoreAttuale= input.nextInt();
			if(valoreAttuale%3==0){
				sommadivisibilitre += valoreAttuale;
				numerodadividere++;
			}
		}
		
		result = sommadivisibilitre/numerodadividere;
		System.out.println("il risultato dell'operazione è "+result);
		

	}

}
