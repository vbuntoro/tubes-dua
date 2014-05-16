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
			P[i] = new Path[8];
			for (int j=0;j<8;j++) {
				P[i][j] = new Path();
			}
		}
		/* Inisialisasi level 1 */
		//row 1
		P[0][0].setPath(false,false,false,false,false);
		P[0][1].setPath(false,false,false,false,false);
		P[0][2].setPath(false,false,false,false,false);
		P[0][3].setPath(false,false,false,false,false);
		P[0][4].setPath(false,true,false,false,false);
		P[0][5].setPath(false,false,false,false,false);
		P[0][6].setPath(true,true,false,false,true);
		P[0][7].setPath(false,false,false,false,false);
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
	}
	public int getMapLevel() {
		return Level;
	}
	public static void main(String args[]) {
		Map M = new Map();
		for (int arah=1;arah<=4;arah++) {
			if (M.isPathValid(arah, 0, 0)) {
				System.out.println("true!");	
			}
			else {
				System.out.println("false!");
			}
		}
	}
}