package boardgame.commands;

import boardgame.boards.Board;
import boardgame.boards.DefaultBoard;
import boardgame.enums.Direction;
import boardgame.pieces.DefaultPiece;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightCommandTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new DefaultBoard(new DefaultPiece());
    }

    @Test
    public void executeRightCommandPieceIsRotated() {
        //given
        RightCommand command = new RightCommand();

        //when
        command.execute(board);

        //then
        assertEquals(Direction.EAST, board.getPiece().getDirection());
        assertEquals(0, board.getPiece().getHorizontalPosition());
        assertEquals(0, board.getPiece().getVerticalPosition());
    }
}
