package fr.wcs.gsf.puissance4;

public class PuissanceIhm {
	
	final static int VIDE = 0 ;
    final static int JAUNE = 1 ;
    final static int ROUGE = 2;
	
	
    static void initialise (int[][] grille) {
        
        for ( int i = 0; i < grille.length ; ++i) {
            for ( int j = 0 ; j < grille[0].length ; ++j){
                grille[i][j] = VIDE;
            }
        }
    }
  
    static void affiche (int[][] grille){
        System.out.println();
        for ( int[] ligne : grille) {
            System.out.print('\u2502');
            for ( int cellule : ligne) {
                if ( cellule == VIDE) {
                    System.out.print(' '); }
                else if ( cellule == ROUGE) {
                    System.out.print('O'); }
                else  {
                    System.out.print('X'); }
                System.out.print('|');
                }
            System.out.println();
            }
        for ( int i = 1 ; i <=grille[0].length; ++i)
        {
           System.out.print("="+i);
        }   System.out.println("=\n");
        }

	
}
