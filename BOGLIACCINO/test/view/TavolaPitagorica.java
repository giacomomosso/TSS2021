package view;

public class TavolaPitagorica {

	public static void main(String[] args) {
		
		int tavolaPitagorica[][] = new int[10][10];
		int posizionex = 0;
		int posizioney = 0;
		
		for(posizioney = 0; posizioney<10; posizioney++) {
			
			
			System.out.println(posizioney);
			tavolaPitagorica[posizioney][posizionex] = posizionex;
			
			for(posizionex = 0; posizionex<10; posizionex++){
				
				tavolaPitagorica[posizioney][posizionex] = posizionex;
				System.out.print(tavolaPitagorica[posizioney][posizionex]);
				
			}
			System.out.println();
			
		}
	
	}

}
