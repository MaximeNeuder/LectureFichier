/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturefichier;

/**
 *
 * @author Maxime
 */
public class ReverseFile extends LecteurFichier{
    
    public ReverseFile(String nomFichier)
	{
		super(nomFichier);
	}
	
	public void AfficherReverseFile()
	{		
		for(int i = super.getContenuFichier().size() - 1; i >= 0; i--) {
			System.out.println(this.getContenuFichier().get(i));
		}
	}
}
