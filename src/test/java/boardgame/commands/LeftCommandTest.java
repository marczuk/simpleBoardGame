package boardgame.commands;

import boardgame.boards.Board;
import boardgame.boards.DefaultBoard;
import boardgame.enums.Direction;
import boardgame.pieces.DefaultPiece;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftCommandTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new DefaultBoard(new DefaultPiece());
    }

    @Test
    public void executeLeftCommandPieceIsRotated() {
        //given
        LeftCommand command = new LeftCommand();

        //when
        command.execute(board);

        //then
        assertEquals(Direction.WEST, board.getPiece().getDirection());
        assertEquals(0, board.getPiece().getHorizontalPosition());
        assertEquals(0, board.getPiece().getVerticalPosition());
    }
}
