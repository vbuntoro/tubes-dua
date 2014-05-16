package tubes2;

public class Path {
	/* Atribut kelas */
	private boolean Front;
	private boolean Back;
	private boolean Left;
	private boolean Right;
	private boolean Goal;
	private boolean Start;
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
	public void setGoal() {
		Goal = true;
	}
	public void setStart() {
		Back = false;
		Start = true;
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
}
