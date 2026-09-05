package com.meeran.arrays;

public class BattleshipFieldValidator {
	public static boolean fieldValidator(int[][] field) {
		int battleship = 0, cruisers = 0, destroyers = 0, submarines = 0;
		for (int y = 0; y < 10; y++)
			for (int x = 0; x < 10; x++) {

				if (field[x][y] == 1) {
					if ((x > 0) && (field[x - 1][y] == 1)) continue;
					if ((y > 0) && (field[x][y - 1] == 1)) continue;

					switch (checkOverklap(x, y, field)) {
						case 1:
							submarines++;
							break;
						case 2:
							destroyers++;
							break;
						case 3:
							cruisers++;
							break;
						case 4:
							battleship++;
							break;
						default:
							return false;
					}
				}
			}

		if (submarines != 4) return false;
		if (destroyers != 3) return false;
		if (cruisers != 2) return false;
		if (battleship != 1) return false;

		return true;
	}

	public static Integer checkOverklap(int x, int y, int[][] field) {
		if ((x > 0) && (y < 9)) if (field[x - 1][y + 1] == 1) return 5;
		if ((x < 9) && (y < 9)) {
			if (field[x + 1][y + 1] == 1) return 5;
			if ((field[x + 1][y] == 1) && (field[x][y + 1] == 1)) return 5;
		}
		if (y < 9) if (field[x][y + 1] == 1) return 1 + checkOverklap(x, y + 1, field);
		if (x < 9) if (field[x + 1][y] == 1) return 1 + checkOverklap(x + 1, y, field);
		return 1;
	}
}
