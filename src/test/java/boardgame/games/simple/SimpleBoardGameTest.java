package boardgame.games.simple;

import boardgame.boards.Board;
import boardgame.boards.DefaultBoard;
import boardgame.enums.Direction;
import boardgame.pieces.DefaultPiece;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleBoardGameTest {

    private Board board;
    private SimpleBoardGame game;

    @BeforeEach
    void setUp() {
        board = new DefaultBoard(new DefaultPiece());
        game = new SimpleBoardGame(board);
    }

    @Test
    public void gameTestGoForward() {
        //when
        String result = game.executeCommands("MMMMMM");

        //then
        assertEquals("0 4 N", result);
        assertEquals(Direction.NORTH, board.getPiece().getDirection());
        assertEquals(0, board.getPiece().getHorizontalPosition());
        assertEquals(4, board.getPiece().getVerticalPosition());
    }

    @Test
    public void gameTestThreeRightTwoUpCommands() {
        //when
        String result = game.executeCommands("RMMMLMM");

        //then
        assertEquals("3 2 N", result);
        assertEquals(Direction.NORTH, board.getPiece().getDirection());
        assertEquals(3, board.getPiece().getHorizontalPosition());
        assertEquals(2, board.getPiece().getVerticalPosition());
    }

    @Test
    public void gameTestGoToMiddleCommands() {
        //when
        String result = game.executeCommands("MRMLMRM");

        //then
        assertEquals("2 2 E", result);
        assertEquals(Direction.EAST, board.getPiece().getDirection());
        assertEquals(2, board.getPiece().getHorizontalPosition());
        assertEquals(2, board.getPiece().getVerticalPosition());
    }
}
