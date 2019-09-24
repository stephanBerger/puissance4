package fr.wcs.gsf.puissance4;

public class Puissance4 {

	public static void main(String[] args) {

		boolean win;
		int[][] grid = new int[6][7];
		
		int colorPlayer = PuissanceIhm.YELLOW;
		
		PuissanceIhm.init(grid);
		PuissanceIhm.display(grid);

		do {
			Game.askAndPlay(grid, colorPlayer);
			PuissanceIhm.display(grid);
			win = Game.isItWon(grid, colorPlayer);
			colorPlayer = Game.permutte(colorPlayer);

		} while (!win);
		if (colorPlayer == PuissanceIhm.YELLOW)
			System.out.println("Le joueur O a gagné");
		else
			System.out.println("Le joueur X a gagné");
	}

}
