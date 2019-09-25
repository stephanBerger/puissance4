package fr.wcs.gsf.puissance4;

import java.util.Scanner;

public class Puissance4 {

	static Scanner question = new Scanner(System.in);
	
//	public Puissance4() {
//		question = new Scanner(System.in);
//	}
	
	public static void main(String[] args) {
		Player joueur1 = new Player("joueur1", "X");
		Player joueur2 = new Player("joueur2", "O");
		
		
		System.out.println("Quel est le nom du premier joueur ?");
		String read = question.nextLine();
		joueur1.setName(read);
		
		
		System.out.println("Quel est le nom du deuxième joueur ?");
		read = question.nextLine();
		joueur2.setName(read);

		boolean win;
		int[][] grid = new int[6][7];
		


		int colorPlayer = PuissanceIhm.YELLOW;

		
		PuissanceIhm.init(grid);
		PuissanceIhm.display(grid);

		do {
			
//			Player joueur = joueur1;
//			Player joueur2 = joueur2;
			
			
			Game.askAndPlay(grid, colorPlayer, joueur1, joueur2);
			joueur1 = joueur1;
			joueur2 = joueur2;
			PuissanceIhm.display(grid);
			win = Game.isItWon(grid, colorPlayer);
			colorPlayer = Game.permutte(colorPlayer);

		} while (!win);
		if (colorPlayer == PuissanceIhm.YELLOW)
			System.out.println(joueur1.getName() +" a gagné !");
		else
			System.out.println(joueur2.getName() +" a gagné !");
	}

}
