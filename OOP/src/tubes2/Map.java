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
		/* Set start node */
		P[6][3].setStart();
		/* Set goal node */
		P[0][3].setGoal();
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
		/* Aturan random map, apabila ada path keatas, maka path diatasnya harus ada path 
		 * kebawah, apabila ada path kekiri, maka path dikirinya harus ada path
		 * kekanan, dan begitu pula sebaliknya 
		 * */
		for (int i=0;i<7;i++) {
			for (int j=0;j<7;j++) {
				int x = (int)(Math.random() * 8) + 1;
				System.out.print(x);
			}
			System.out.println();
		}		
	}
	/* Main */
	public static void main(String args[]) {
		Map M = new Map();
		M.randomMap();
	}
}