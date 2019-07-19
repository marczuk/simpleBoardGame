package boardgame.boards;

import boardgame.pieces.DefaultPiece;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultBoardTest {

    @Test
    public void initDefaultBoardHasCorrectSize() {
        //given
        DefaultPiece piece = new DefaultPiece();
        DefaultBoard board = new DefaultBoard(piece);

        //then
        assertEquals(5, board.getHorizontalSize());
        assertEquals(5, board.getVerticalSize());
        assertEquals(piece, board.getPiece());
    }
}
