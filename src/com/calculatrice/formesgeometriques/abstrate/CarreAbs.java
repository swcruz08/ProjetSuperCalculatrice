package com.calculatrice.formesgeometriques.abstrate;



public class CarreAbs  extends AbsFormeGeometrique implements IFormeGeometrique{
	// fildes
	private double cote;
	
	//contructors
	public CarreAbs(double cote) {
		this.cote = cote;
	}
	
	// methods
	@Override
	public double getArea() {
		
		return Math.pow(cote, 2);
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	// getters and settes
	
	
	
}
