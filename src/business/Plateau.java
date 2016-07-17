package business;

/**
 * A rectangular plateau.
 * 
 *
 */
public class Plateau {
	private int xSize;
	private int ySize;
	
	/**
	 * Initializes the plateau.
	 * @param x Size in the x axis.
	 * @param y Size in the y axis.
	 */
	public Plateau(int x, int y) {
		this.xSize = x;
		this.ySize = y;
	}

	public int getxSize() {
		return xSize;
	}

	public int getySize() {
		return ySize;
	}
	
	/**
	 * Checks if the position newX is inside the limits of the plateau.
	 * @param position Position to be checked.
	 * @return
	 */
	public boolean isXPositionValid(int position) {
		return (position >= 0 && position <= this.xSize);
	}
	
	/**
	 * Checks if the position newY is inside the limits of the plateau.
	 * @param position Position to be checked.
	 * @return
	 */
	public boolean isYPositionValid(int position) {
		return (position >= 0 && position <= this.ySize);
	}
}
