package boardgame.commands;

import boardgame.boards.Board;
import boardgame.enums.Direction;

public class MoveCommand implements Command{

    private int step = 1;

    public void execute(Board board) {

        Direction direction = board.getPiece().getDirection();

        switch(direction) {
            case NORTH:
                moveVertical(board, true);
                break;
            case SOUTH:
                moveVertical(board, false);
                break;
            case EAST:
                moveHorizontal(board, true);
                break;
            case WEST:
                moveHorizontal(board, false);
                break;
        }

    }

    private void moveVertical(Board board, boolean forward) {
        int newposition = board.getPiece().getVerticalPosition() + (forward ? step : -1*step );
        if (newposition > 0 && newposition < board.getVerticalSize()) {
            board.getPiece().setVerticalPosition(newposition);
        }
    }

    private void moveHorizontal(Board board, boolean forward) {
        int newposition = board.getPiece().getHorizontalPosition() + (forward ? step : -1*step );
        if (newposition > 0 && newposition < board.getHorizontalSize()) {
            board.getPiece().setHorizontalPosition(newposition);
        }
    }
}
