
public class Main {

	public static void main(String[] args) {
		
		Gioco g = new Gioco(6);
		int[] pescate = {1,5,3,3,3,3};
		
		g.giocata(pescate);
		g.print();

		
		g.giocata(pescate);
		g.print();
		
		g.giocata(pescate);
		g.print();
		
		g.giocata(pescate);
		g.print();
		
		
		
		g = new Gioco(3);
		int[] pescate1 = {1,2,3,4,5,6};
		
		g.giocata(pescate1);
		g.print();
		g.giocata(pescate1);
		g.print();
		g.giocata(pescate1);
		g.print();
		g.giocata(pescate1);
		g.print();
	}

}
