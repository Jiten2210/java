package Programming;

//Needed only by MazePosition
import java.util.Arrays;
import java.util.Objects;

enum Direction {
	UP(-1, 0), DOWN(1, 0), LEFT(0, -1), RIGHT(0, 1);
	// config
	private final int rowSteps;
	private final int colSteps;

	private Direction(int rowSteps, int colSteps) {
		this.rowSteps = rowSteps;
		this.colSteps = colSteps;
	}

	public int getNewRowIdx(int currentRowIdx) {
		return (currentRowIdx + getRowSteps());
	}

	public int getNewColIdx(int currentColIdx) {
		return (currentColIdx + getColSteps());
	}

	public int getRowSteps() {
		return rowSteps;
	}

	public int getColSteps() {
		return colSteps;
	}
};

class MazePosition {

	private static int[][] MAZE_GRID;
	private final int rowIdx;
	private final int colIdx;

	private final int rowIdxMinus1;
	private final int colIdxMinus1;

	public MazePosition(int[][] MAZE_GRID) {
		if (MazePosition.MAZE_GRID != null) {
			throw new IllegalStateException("Maze double-array already set. Use x/y constructor.");
		}
		MazePosition.MAZE_GRID = MAZE_GRID;

		rowIdx = -1;
		colIdx = -1;
		rowIdxMinus1 = -1;
		colIdxMinus1 = -1;
	}

	public MazePosition(int rowIdx, int colIdx) {
		if (MazePosition.MAZE_GRID == null) {
			throw new IllegalStateException("Must set maze double-array with: new MazePosition(int[][]).");
		}

		if (rowIdx < 0 || rowIdx >= MazePosition.getRowCount()) {
			throw new IllegalArgumentException("rowIdx (" + rowIdx + ") is invalid.");
		}
		if (colIdx < 0 || colIdx >= MazePosition.getColumnCount()) {
			throw new IllegalArgumentException("colIdx (" + colIdx + ") is invalid.");
		}

		this.rowIdx = rowIdx;
		this.colIdx = colIdx;
		rowIdxMinus1 = (rowIdx - 1);
		colIdxMinus1 = (colIdx - 1);
	}

	public boolean isPath() {
		return (getValue() == 0); // 1???
	}

	public int getValue() {
		return MazePosition.MAZE_GRID[getRowIdx()][getColumnIdx()];
	}

	public int getRowIdx() {
		return rowIdx;
	}

	public int getColumnIdx() {
		return colIdx;
	}

	public MazePosition getNeighbor(Direction dir) {
		Objects.requireNonNull(dir, "dir");
		return (new MazePosition(dir.getNewRowIdx(getRowIdx()), dir.getNewColIdx(getColumnIdx())));
	}

	public MazePosition getNeighborNullIfEdge(Direction dir) {
		if (isEdgeForDirection(dir)) {
			return null;
		}
		return getNeighbor(dir);
	}

	public int getNeighborValueNeg1IfEdge(Direction dir) {
		MazePosition pos = getNeighborNullIfEdge(dir);
		return ((pos == null) ? -1 : pos.getValue());
	}

	public static final int getRowCount() {
		return MAZE_GRID.length;
	}

	public static final int getColumnCount() {
		return MAZE_GRID[0].length;
	}

	public boolean isEdgeForDirection(Direction dir) {
		Objects.requireNonNull(dir);
		switch (dir) {
		case UP:
			return isTopEdge();
		case DOWN:
			return isBottomEdge();
		case LEFT:
			return isLeftEdge();
		case RIGHT:
			return isRightEdge();
		}
		throw new IllegalStateException(toString() + ", dir=" + dir);
	}

	public boolean isLeftEdge() {
		return (getColumnIdx() == 0);
	}

	public boolean isTopEdge() {
		return (getRowIdx() == 0);
	}

	public boolean isBottomEdge() {
		return (getRowIdx() == rowIdxMinus1);
	}

	public boolean isRightEdge() {
		return (getColumnIdx() == colIdxMinus1);
	}

	public String toString() {
		return "[" + getRowIdx() + "," + getColumnIdx() + "]=" + getValue();
	}

	public String getNineByNine() {
		int[][] nineByNine = new int[3][3];

		// Middle row
		nineByNine[1][1] = getValue();
		nineByNine[1][0] = getNeighborValueNeg1IfEdge(Direction.LEFT);
		nineByNine[1][2] = getNeighborValueNeg1IfEdge(Direction.RIGHT);

		// Top
		MazePosition posUp = getNeighborNullIfEdge(Direction.UP);
		if (posUp != null) {
			nineByNine[0][0] = posUp.getNeighborValueNeg1IfEdge(Direction.LEFT);
			nineByNine[0][1] = posUp.getValue();
			nineByNine[0][2] = posUp.getNeighborValueNeg1IfEdge(Direction.RIGHT);
		}

		// Bottom
		MazePosition posDown = getNeighborNullIfEdge(Direction.DOWN);
		if (posDown != null) {
			nineByNine[2][0] = posDown.getNeighborValueNeg1IfEdge(Direction.LEFT);
			nineByNine[2][1] = posDown.getValue();
			nineByNine[2][2] = posDown.getNeighborValueNeg1IfEdge(Direction.RIGHT);
		}

		String sLS = System.getProperty("line.separator", "\r\n");
		return "Middle position in 9x9 grid is *this*: " + toString() + sLS + Arrays.toString(nineByNine[0]) + sLS
				+ Arrays.toString(nineByNine[1]) + sLS + Arrays.toString(nineByNine[2]);
	}
}

public class MazePosDemo {
	private static final int[][] MAZE_GRID = new int[][] {
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1,
					0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0,
					0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1,
					1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1,
					0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0,
					0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
			{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1,
					0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
					0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1,
					1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1 },
			{ 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0,
					0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1,
					0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0,
					0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1,
					1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1,
					0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1,
					0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1,
					0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1,
					0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1,
					0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1,
					1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0,
					0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1,
					0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1,
					1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0,
					0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1,
					0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1,
					0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1,
					1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0,
					0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 } };
	private static final MazePosition MAZE_HOLDER = new MazePosition(MAZE_GRID);

	public static final void main(String[] ignored) {
		MazePosition pos = new MazePosition(0, 0);
		System.out.println("start: " + pos);

		pos = pos.getNeighbor(Direction.RIGHT);
		System.out.println("right: " + pos);

		pos = pos.getNeighbor(Direction.RIGHT);
		System.out.println("right: " + pos);

		pos = pos.getNeighbor(Direction.DOWN);
		System.out.println("down:  " + pos);

		pos = pos.getNeighbor(Direction.DOWN);
		System.out.println("down:  " + pos);

		pos = pos.getNeighbor(Direction.RIGHT);
		System.out.println("right: " + pos);

		pos = pos.getNeighbor(Direction.DOWN);
		System.out.println("down:  " + pos);

		pos = pos.getNeighbor(Direction.LEFT);
		System.out.println("left:  " + pos);

		pos = pos.getNeighbor(Direction.UP);
		System.out.println("up:    " + pos);

		pos = pos.getNeighbor(Direction.UP);
		System.out.println("up:    " + pos);

		System.out.println(pos.getNineByNine());
	}

}