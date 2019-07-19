package boardgame.pieces;

import boardgame.enums.Direction;

public abstract class Piece {
    private Direction direction;

    // 0 - horizontal position
    // 1 - vertical position
    private int[] position;

    public Piece(int[] startPosition, Direction startDirection) {
        this.position = startPosition;
        this.direction = startDirection;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setHorizontalPosition(int position) {
        this.position[0] = position;
    }

    public void setVerticalPosition(int position) {
        this.position[1] = position;
    }

    public int getHorizontalPosition() {
        return position[0];
    }

    public int getVerticalPosition() {
        return position[1];
    }

}
