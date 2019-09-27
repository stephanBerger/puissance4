package fr.wcs.gsf.puissance4;

import java.util.Scanner;

public class Game {

	static Scanner question = new Scanner(System.in);

	static boolean play(int[][] grille, int colonne, int couleur) {
		int ligne = grille.length - 1;
		if (colonne >= grille[0].length || colonne < 0)
			return false;
		while ((ligne >= 0) && grille[ligne][colonne] != PuissanceIhm.VOID) {
			--ligne;
		}
		if (ligne >= 0) {
			grille[ligne][colonne] = couleur;
			return true;
		} else {
			return false;
		}
	}
	
		

	static int permutte(int couleurJoueur) {
		if (couleurJoueur == PuissanceIhm.YELLOW) {
			return PuissanceIhm.RED;
		} else {
			return PuissanceIhm.YELLOW;
		}
	}

	
	static void askAndPlay(int[][] grille, int couleurJoueur, Player joueur1, Player joueur2) {

		boolean valide;
		do {
			
			if (couleurJoueur == PuissanceIhm.YELLOW) {
				Player.yourTurn("A vous de jouer " + joueur1.getName());
				System.out.print("Votre jeton : " + joueur1.getJeton() + "\n");
			} else {
				Player.yourTurn("A vous de jouer " + joueur2.getName());
				System.out.print("Votre jeton : " + joueur2.getJeton() + "\n");
			}
			System.out.print("Entrez votre choix pour la colonne:");
			int column = question.nextInt();
			--column;
			valide = play(grille, column, couleurJoueur);
			if (!valide) {
				System.out.println("Ce coup n'est pas valide !!");
			}
		} while (!valide);
	}

	static boolean isItWon(int[][] grid, int colorPlayer) {

		for (int ligne = 0; ligne < grid.length; ++ligne) {
			for (int column = 0; column < grid[ligne].length; ++column) {
				int colorCell = grid[ligne][column];
				if (colorCell == colorPlayer) {
					if ((
							ligne >= 3 && count(grid, ligne, column, -1, +1) >= 4)
							|| (column <= grid[ligne].length - 4 && count(grid, ligne, column, 0, +1) >= 4)
							|| (ligne <= grid.length - 4 && column <= grid[ligne].length - 4
									&& count(grid, ligne, column, +1, +1) >= 4)
							|| (ligne <= grid.length - 4 && count(grid, ligne, column, +1, 0) >= 4)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	static int count(int[][] grid, int startLigne, int startColumn, int dirLigne, int dirColumn) {
		int count = 0;

		int ligne = startLigne;
		int column = startColumn;
		while (ligne < grid.length && column < grid[0].length && grid[ligne][column] == grid[startLigne][startColumn]) {
			++count;
			ligne = ligne + dirLigne;
			column = column + dirColumn;
		}
		return count;
	}

}