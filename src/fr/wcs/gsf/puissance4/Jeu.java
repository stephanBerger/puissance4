package fr.wcs.gsf.puissance4;

public class Jeu {
	
	
	static boolean  joue(int[][] grille, int colonne, int couleur)
	 
    {   //Nombre de colonne est égale la largeur de la grille - 1
        int ligne = grille.length-1;
        //on teste si le numero de colonne entré est inf à 0 ou supe à gille.lenght-1
        if ( colonne >= grille[0].length || colonne < 0) return false;
        
        
        while( (ligne >=0) && grille[ligne][colonne]!= PuissanceIhm.VIDE) {
            --ligne;
        }
        
        if (ligne >=0) {
        grille[ligne][colonne]= couleur; 
        return true ;
        } else {
        return false;
        }
         
    }
	
}
