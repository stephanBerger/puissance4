package fr.wcs.gsf.puissance4;

public class PuissanceIhm {
	

	
	final static int VOID = 0;
	final static int YELLOW = 1;
	final static int RED = 2;

	static void init(int[][] grid) {

		for (int i = 0; i < grid.length; ++i) {
			for (int j = 0; j < grid[0].length; ++j) {
				grid[i][j] = VOID;
			}
		}
	}

	static void display(int[][] grid) {
		System.out.println();
		for (int[] ligne : grid) {
			System.out.print("\u2503");
			for (int cell : ligne) {
				if (cell == VOID) {
					System.out.print(' ');
				} else if (cell == RED) {
					System.out.print('O');
				} else {
					System.out.print('X');
				}
				System.out.print("\u2503");
			}
			System.out.println();
		}

		for (int i = 1; i <= grid[0].length; ++i)
		{	
			System.out.print("\u2503" + i);
		}
		System.out.println("\u2503\n");
	}
	
	
}
