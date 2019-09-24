package fr.wcs.gsf.puissance4;

import java.util.Scanner;

public class Puissance4 {

	public static void main(String[] args) {
	
		Scanner saisiColonne = new Scanner(System.in);
		boolean valide = false;
		int[][] grille= new int[6][7];
		
		
		PuissanceIhm.initialise(grille);
		PuissanceIhm.affiche(grille);
		
		
        do {
            System.out.print(" Joueur ");
            if (Joueur.couleurJoueur == JAUNE ){
                System.out.print("X"); 
            } else {
                System.out.print("O");
            }
            System.out.print(" entrez un numero de colonne ");
            int colonne = saisiColonne.nextInt();
            --colonne;
            valide = joue(grille, colonne, couleurJoueur);
            if ( !valide ) { System.out.println("Ce coup n'est pas valide");
            }
        } while (!valide);
    }
		
	}


