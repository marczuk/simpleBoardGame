package boardgame.commands;

import boardgame.boards.Board;

public class LeftCommand extends TurnCommand implements Command {

    public LeftCommand() {
        super(-90);
    }

    public void execute(Board board) {
        takeTurn(board);
    }
}
