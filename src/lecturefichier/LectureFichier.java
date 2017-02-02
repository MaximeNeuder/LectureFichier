/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturefichier;
import java.io.IOException;
import lecturefichier.LecteurFichier;

/**
 *
 * @author licence
 */
public class LectureFichier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        LecteurFichier f = new LecteurFichier("F:/LectureFichier/src/lecturefichier/test.txt");
        ReverseFile i = new ReverseFile("F:/LectureFichier/src/lecturefichier/test.txt");
        Palyndrome p = new Palyndrome("F:/LectureFichier/src/lecturefichier/test.txt");
        
        
       f.Lire();
       
       f.AfficherContenuFichier();
       
        
        i.Lire();
        
        i.AfficherReverseFile();
        
        p.Lire();
        
        p.AfficherPalyndrome();
    }
    
}
