package Licenta;

public class Utilizator implements CalculeDateGenerate {
	int varstaUtilizator;
	int greutateInKilogrameUtilizator;
	int inaltimeUtilizator;
	public Utilizator(int varstaUtilizator, int greutateInKilogrameUtilizator, int inaltimeUtilizator) {
		super();
		this.varstaUtilizator = varstaUtilizator;
		this.greutateInKilogrameUtilizator = greutateInKilogrameUtilizator;
		this.inaltimeUtilizator = inaltimeUtilizator;
	}
	@Override
	public double calculeazaBmrFormulaHarrisBenedict() {
		return 13.397*this.greutateInKilogrameUtilizator+4.799 *this.inaltimeUtilizator-5.667 *this.varstaUtilizator+88.362;
	}
	
	
}
