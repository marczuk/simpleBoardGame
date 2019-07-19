package boardgame.commands;

import boardgame.boards.Board;

public interface Command {

    void execute(Board board);
}
