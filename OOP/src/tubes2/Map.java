package tubes2;

public class Map {
	/* Atribut kelas */
	private int Level;
	private Path[][] P;
	/* Konstruktor */
	public Map() {
		/* Deklarasi array 2 dimensi */
		P = new Path[8][];
		for (int i=0;i<8;i++) {
			P[i] = new Path[7];
			for (int j=0;j<7;j++) {
				P[i][j] = new Path();
			}
		}
		/* Inisialisasi level 1 */
		Level = 1;
		randomMap();
	}
	/* Melakukan validasi, 1 adalah depan, 2 adalah belakang, 3 adalah kiri, 4 adalah kanan */
	public boolean isPathValid(int arah, int i, int j) {
		boolean x = false;
		switch(arah) {
			case 1: x = P[i][j].getFront(); break;
			case 2: x = P[i][j].getBack(); break;
			case 3: x = P[i][j].getLeft(); break;
			case 4: x = P[i][j].getRight(); break;
		}
		return x;
	}
	public void increaseMapLevel() {
		Level++;
		randomMap();
	}
	public int getMapLevel() {
		return Level;
	}
	/* Randomizer map */
	public void randomMap() {
		/* Melakukan random map dengan 3 pattern
		 * Setiap pattern map memiliki perbedaan arah dan goal
		 */
		int x = (int)(Math.random() * 2) + 1; //random 1-2
		switch (x) {
			case 1: P[0][3].setPath(8); P[0][5].setPath(4); P[0][5].setGoal();
					P[1][3].setPath(4); P[1][4].setPath(8); P[1][5].setPath(4); P[1][6].setPath(8);
					P[2][2].setPath(8); P[2][3].setPath(5); P[2][4].setPath(1); P[2][5].setPath(3); P[2][6].setPath(2);
					P[3][1].setPath(8); P[3][2].setPath(8); P[3][4].setPath(4); P[3][6].setPath(4);
					P[4][1].setPath(7); P[4][2].setPath(1); P[4][3].setPath(4); P[4][4].setPath(3); P[4][5].setPath(4);
										P[4][6].setPath(2);
					P[5][2].setPath(4); P[5][4].setPath(2); P[5][5].setPath(4); P[5][6].setPath(6);
					P[6][2].setPath(4); P[6][2].setStart(); P[6][4].setPath(8);
					break;
			case 2: P[0][1].setPath(8); P[0][2].setPath(4); P[0][2].setGoal(); P[0][5].setPath(8); P[0][6].setPath(8);
					P[1][1].setPath(4); P[1][2].setPath(4); P[1][3].setPath(8); P[1][4].setPath(7); P[1][5].setPath(3);
										P[1][6].setPath(8);
					P[2][0].setPath(8); P[2][1].setPath(1); P[2][2].setPath(3); P[2][3].setPath(3); P[2][4].setPath(4);
										P[2][6].setPath(4);
					P[3][1].setPath(4); P[3][3].setPath(4); P[3][4].setPath(8); P[3][6].setPath(4);
					P[4][1].setPath(4); P[4][3].setPath(4); P[4][5].setPath(7); P[4][6].setPath(5);
					P[5][0].setPath(8); P[5][1].setPath(5); P[5][2].setPath(4); P[5][3].setPath(1); P[5][4].setPath(4);
										P[5][5].setPath(7); P[5][6].setPath(2);
					P[6][0].setPath(7); P[6][1].setPath(7); P[6][3].setPath(4); P[6][3].setStart(); P[6][6].setPath(8);
					break;
			case 3: break;
		}
		
	}
	/* Main */
	public static void main(String args[]) {
		Map M = new Map();
		M.randomMap();
	}
}