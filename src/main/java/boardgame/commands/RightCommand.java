package boardgame.commands;

import boardgame.boards.Board;

public class RightCommand extends TurnCommand implements Command {

    public RightCommand() {
        super(90);
    }

    public void execute(Board board) {
        takeTurn(board);
    }
}
