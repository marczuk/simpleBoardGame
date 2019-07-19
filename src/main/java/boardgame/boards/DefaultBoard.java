package boardgame.boards;

import boardgame.pieces.DefaultPiece;

public class DefaultBoard extends Board {

    public DefaultBoard(DefaultPiece piece) {
        super(new int[5][5], piece);
    }
}
