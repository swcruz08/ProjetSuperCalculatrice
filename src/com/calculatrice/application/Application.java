
package com.calculatrice.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.calculatrice.formesgeometriques.Carre;
import com.calculatrice.formesgeometriques.FormeGeometrique;
import com.calculatrice.formesgeometriques.Triangle;
import com.calculatrice.formesgeometriques.abstrate.AbsFormeGeometrique;
import com.calculatrice.formesgeometriques.abstrate.CarreAbs;
import com.calculatrice.formesgeometriques.abstrate.CircleAbs;
import com.calculatrice.formesgeometriques.abstrate.IFormeGeometrique;
import com.calculatrice.formesgeometriques.abstrate.TriangleAbs;


public class Application {

	public static void main(String[] args) {
		Triangle myTriangle = new Triangle();
		
		myTriangle.setHauteur(3);
		myTriangle.setBase(5);
		System.out.println(myTriangle.aireCalculus());
		
		Carre myCarre = new Carre(2.2);
		
		System.out.println(myCarre.miPerimetre());
		
		FormeGeometrique formeGeometrique = new Carre();
		
		myCarre.getPerimetrePuissance();
		formeGeometrique.getPerimetrePuissance();
		
		List<FormeGeometrique> listFormes = new ArrayList<>();
		listFormes.add(new Carre());
		listFormes.add(new Triangle());
		
		//=====================================//
		
		IFormeGeometrique formeCircle = new CircleAbs(4.2);
		IFormeGeometrique formeTriangle = new TriangleAbs(0.98, 5.13);
		IFormeGeometrique formeCarre = new CarreAbs(3.48);
		
		List<IFormeGeometrique> listIFormeGeometriques = new ArrayList<>();
		
		listIFormeGeometriques.add(formeCarre);
		listIFormeGeometriques.add(formeTriangle);
		listIFormeGeometriques.add(formeCircle);
		
		listIFormeGeometriques.forEach((forme)-> {
			System.out.println(forme.getClass().getSimpleName() + ": "+ forme.getArea());
		});
		
		for (IFormeGeometrique f : listIFormeGeometriques) {
			
			System.out.println(f.getClass().getSimpleName() + ": "+ f.getArea());
			
		}
		
		
	}

}
