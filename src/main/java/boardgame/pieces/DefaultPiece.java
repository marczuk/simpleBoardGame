package boardgame.pieces;

import boardgame.enums.Direction;

public class DefaultPiece extends Piece{

    public DefaultPiece(){
        super(new int[2], Direction.NORTH);
    }
}
