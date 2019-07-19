package boardgame.boards;

import boardgame.pieces.Piece;

public abstract class Board {
    protected final int[][] boardSize;

    protected Piece piece;

    public Board(int[][] boardSize, Piece piece) {
        this.piece = piece;
        this.boardSize = boardSize;
    }

    public int getHorizontalSize() {
        return boardSize.length;
    }

    public int getVerticalSize() {
        return boardSize[0].length;
    }

    public Piece getPiece() {
        return piece;
    }
}
