package business;

public class Rover {
	private int xPosition;
	
	private int yPosition;
	
	private Direction direction;
	
	private Plateau plateau;
	
	public Rover(int x, int y, Direction direction, Plateau p) {
		this.xPosition = x;
		this.yPosition = y;
		this.direction = direction;
		plateau = p;
	}

	public int getxPosition() {
		return xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public Direction getDirection() {
		return direction;
	}
	
	/**
	 * Turns the rover to the left.
	 */
	public void turnLeft() {
		if(this.direction == Direction.N) this.direction = Direction.W;
		if(this.direction == Direction.W) this.direction = Direction.S;
		if(this.direction == Direction.S) this.direction = Direction.E;
		if(this.direction == Direction.E) this.direction = Direction.N;
	}
	
	/**
	 * Turns the rover to the right.
	 */
	public void turnRight() {
		if(this.direction == Direction.N) this.direction = Direction.E;
		if(this.direction == Direction.E) this.direction = Direction.S;
		if(this.direction == Direction.S) this.direction = Direction.W;
		if(this.direction == Direction.W) this.direction = Direction.N;
	}
	
	/**
	 * Moves in the x axis
	 * @param value
	 * @throws InvalidPositionException
	 */
	private void moveHorizontally(int value) throws InvalidPositionException {
		int testPosition = this.xPosition + value;
		if(!this.plateau.isXPositionValid(testPosition)) {
			throw new InvalidPositionException("ERROR: Position (" + testPosition + 
					") invalid in x axis of this Plateau!");
		} else {
			this.xPosition += value;
		}
	}
	
	/**
	 * Moves in the y axis
	 * @param value
	 * @throws InvalidPositionException
	 */
	private void moveVertically(int value) throws InvalidPositionException {
		int testPosition = yPosition + value;
		if(!this.plateau.isYPositionValid(testPosition)) {
			throw new InvalidPositionException("ERROR: Position (" + testPosition + 
					") invalid in y axis of this Plateau!");
		} else {
			this.yPosition += value;
		}
	}
	
	/**
	 * Moves one position in the present direction
	 * @throws InvalidPositionException
	 */
	public void move() throws InvalidPositionException {
		if(this.direction == Direction.N) {
			moveVertically(1);
		}
		
		if(this.direction == Direction.W) {
			moveHorizontally(-1);
		}
		
		if(this.direction == Direction.S) {
			moveVertically(-1);
		}
		
		if(this.direction == Direction.E) {
			moveHorizontally(1);
		}
	}
	
}
