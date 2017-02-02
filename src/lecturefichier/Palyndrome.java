/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturefichier;

import java.util.LinkedList;

/**
 *
 * @author Maxime
 */
public class Palyndrome extends LecteurFichier{

    public Palyndrome(String nomFichier) {
        super(nomFichier);
    }

	
	public void AfficherPalyndrome() {
		for(int i = 0; i < this.getContenuFichier().size(); i++) {
			for(int y = 0; y < this.getContenuFichier().get(i).length(); y++) {
				System.out.println(Character.toString(this.getContenuFichier().get(i).charAt(y)));
			}
		}
		
	}
        
      
}
