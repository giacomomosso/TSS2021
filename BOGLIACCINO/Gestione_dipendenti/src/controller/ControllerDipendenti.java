package controller;
import model.Dipendente;

public class ControllerDipendenti {
	private Dipendente[] dipendenti;
	
	
	public ControllerDipendenti(int size) {
		super();
		this.dipendenti = new Dipendente[size];
	}

	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}
	

}
