package com.calculatrice.formesgeometriques.abstrate;

public class TriangleAbs extends AbsFormeGeometrique  implements IFormeGeometrique{
    //fields
	private double base;
	private double hauter;
	
	public TriangleAbs(double base, double hauter) {
		this.base = base;
		this.hauter = hauter;
	}

	// contructor
	
	@Override
	public double getArea() {
		
		return (base * hauter)/2;
	}


	// gette and setter
	
	public double getBase() {
		return base;
	}


	
	public void setBase(double base) {
		this.base = base;
	}

	public double getHauter() {
		return hauter;
	}

	public void setHauter(double hauter) {
		this.hauter = hauter;
	}


	
}
