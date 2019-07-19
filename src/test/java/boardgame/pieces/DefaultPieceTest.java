package boardgame.pieces;

import boardgame.enums.Direction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultPieceTest {
    @Test
    public void initDefaultPieceHasCorrectDefault() {
        //given
        DefaultPiece board = new DefaultPiece();

        //then
        assertEquals(0, board.getHorizontalPosition());
        assertEquals(0, board.getVerticalPosition());
        assertEquals(Direction.NORTH, board.getDirection());
    }
}
