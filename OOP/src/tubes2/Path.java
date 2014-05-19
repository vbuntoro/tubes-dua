package tubes2;

public class Path {
	/* Atribut kelas */
	private boolean Front; //apabila ada jalan kedepan
	private boolean Back; //apabila ada jalan kebelakang
	private boolean Left; //apabila ada jalan kekiri
	private boolean Right; //apabila ada jalan kekanan
	private boolean Goal; //apabila merupakan goal
	private boolean Start; //apabila merupakan start
	private int Facing; //mengubah value facing yang merupakan sebuah permasalah pada FPS
	/* Konstruktor dan Konstruktor parameter */
	public Path() { 
		Front = false;
		Back = false;
		Left = false;
		Right = false;
		Goal = false;
		Start = false;
	}
	/* Setter */
	public void setPath (int a) {
		switch (a) {
			case 1: Front = true; Back = true; Left = true; Right = true; break;
			case 2: Front = true; Back = true; Left = true; Right = false; break;
			case 3: Front = true; Back = true; Left = false; Right = true; break;
			case 4: Front = true; Back = true; Left = false; Right = false; break;
			case 5: Front = false; Back = true; Left = true; Right = true; break;
			case 6: Front = false; Back = true; Left = true; Right = false; break;
			case 7: Front = false; Back = true; Left = false; Right = true; break;
			case 8: Front = false; Back = true; Left = false; Right = false; break;
		}
	}
	public void setGoal(boolean a) {
		Goal = a;
	}
	public void setStart(boolean a) {
		Back = false;
		Start = a;
	}
	public void setFacing(int a) {
		Facing = a;
	}
	/* Getter */
	public boolean getFront() {
		return Front;
	}
	public boolean getBack() {
		return Back;
	}
	public boolean getLeft() {
		return Left;
	}
	public boolean getRight() {
		return Right;
	}
	public boolean getGoal() {
		return Goal;
	}
	public boolean getStart() {
		return Start;
	}
	public int getFacing() {
		return Facing;
	}
	}
}