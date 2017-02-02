package lecturefichier;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.lang.ArrayIndexOutOfBoundsException;

import java.io.IOException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author licence
 */
public class LecteurFichier {
    private File fichier;
  
    private LinkedList<String> contenuFichier;

        
    public LecteurFichier(String nomFichier)
	{
		
		this.fichier = new File(nomFichier);
		this.contenuFichier = new LinkedList<String>();
		
	}
    
    public void Ouvrir()
    {
        if(this.fichier.exists()) {
			System.out.println("Ce fichier existe");
		} else {
			System.out.println("Ce fichier n'existe pas");
		}	
		
    }
    
    public void Lire() throws FileNotFoundException, IOException
    {
        
        
        
        boolean fileExists = this.fichier.exists();
        
        if(fileExists==true)
        {
           
			BufferedReader in = new BufferedReader(new FileReader(this.fichier));
			String line;
			while ((line = in.readLine()) != null)
			{
		      // Afficher le contenu du fichier
                            this.contenuFichier.add(line);
                            
   			  
			}
			in.close();
}
        else
        {
            System.out.println("Le Fichier n'existe pas");
        }
}
    
	
	public LinkedList<String> getContenuFichier() {
		return contenuFichier;
	}	
        
        public void AfficherContenuFichier()
        {
            for(int i = 0; i < this.getContenuFichier().size(); i++) {
			System.out.println(this.getContenuFichier().get(i));
		}
        }
        
        
}
