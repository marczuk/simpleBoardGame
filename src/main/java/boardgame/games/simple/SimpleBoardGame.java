package boardgame.games.simple;

import boardgame.boards.Board;
import boardgame.games.BoardGame;

public class SimpleBoardGame extends BoardGame {
    public SimpleBoardGame(Board board) {
        super(board, new SimpleCommandFactory());
    }
}
