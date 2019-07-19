package boardgame.commands;


import boardgame.boards.Board;
import boardgame.enums.Direction;

abstract class TurnCommand implements Command {

    private final int degress;

    public TurnCommand(int degress) {
        this.degress = degress;
    }

    protected void takeTurn(Board board) {
        int currentDegrees = board.getPiece().getDirection().getDegrees();
        Direction newDirection = Direction.getByDegrees(currentDegrees + degress);
        board.getPiece().setDirection(newDirection);
    }
}
