package com.calculatrice.formesgeometriques;


public class FormeGeometrique {
	//fildes
	
	double perimetre;
	
	
	
	// controcter
	
	public FormeGeometrique() {
		
	}
	
	public FormeGeometrique(double perimetre) {
	this.perimetre = perimetre;	
	}
	// methods

	
	
	// setter and getters
	public double getPerimetre() {
		return this.perimetre;
	}

	public void setPerimetre(double perimetre) {
		this.perimetre = perimetre;

	}

	public double getPerimetrePuissance() {
		return Math.pow(perimetre, 2);
	}
	
	
}
