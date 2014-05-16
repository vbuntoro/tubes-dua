package tubes2;

public class Path {
	/* Atribut kelas */
	private boolean Front;
	private boolean Back;
	private boolean Left;
	private boolean Right;
	private boolean Goal;
	/* Konstruktor dan Konstruktor parameter */
	public Path() { 
		Front = false;
		Back = false;
		Left = false;
		Right = false;
		Goal = false;
	}
	public void setPath (boolean a, boolean b, boolean c, boolean d, boolean e) {
		Front = a;
		Back = b;
		Left = c;
		Right = d;
		Goal = e;
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
}
