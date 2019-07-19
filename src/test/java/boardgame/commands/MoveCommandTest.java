package boardgame.commands;

import boardgame.boards.Board;
import boardgame.boards.DefaultBoard;
import boardgame.enums.Direction;
import boardgame.pieces.DefaultPiece;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveCommandTest {

    private Board board;
    private MoveCommand command;

    @BeforeEach
    void setUp() {
        command = new MoveCommand();
        board = new DefaultBoard(new DefaultPiece());
    }

    @Test
    public void executeMoveCommandPieceChangePositionVertical() {
        //when
        command.execute(board);

        //then
        assertEquals(Direction.NORTH, board.getPiece().getDirection());
        assertEquals(0, board.getPiece().getHorizontalPosition());
        assertEquals(1, board.getPiece().getVerticalPosition());
    }

    @Test
    public void executeMoveCommandPieceSouthChangePositionVerticalBackward() {
        //given
        board.getPiece().setDirection(Direction.SOUTH);
        board.getPiece().setVerticalPosition(2);

        //when
        command.execute(board);

        //then
        assertEquals(Direction.SOUTH, board.getPiece().getDirection());
        assertEquals(0, board.getPiece().getHorizontalPosition());
        assertEquals(1, board.getPiece().getVerticalPosition());
    }

    @Test
    public void executeMoveCommandPieceEastChangePositionHorizontal() {
        //given
        board.getPiece().setDirection(Direction.EAST);

        //when
        command.execute(board);

        //then
        assertEquals(Direction.EAST, board.getPiece().getDirection());
        assertEquals(1, board.getPiece().getHorizontalPosition());
        assertEquals(0, board.getPiece().getVerticalPosition());
    }

    @Test
    public void executeMoveCommandPieceWestChangePositionHorizontalBackward() {
        //given
        board.getPiece().setDirection(Direction.WEST);
        board.getPiece().setHorizontalPosition(2);

        //when
        command.execute(board);

        //then
        assertEquals(Direction.WEST, board.getPiece().getDirection());
        assertEquals(1, board.getPiece().getHorizontalPosition());
        assertEquals(0, board.getPiece().getVerticalPosition());
    }

    @Test
    public void executeMoveCommandPieceEastNotChangePositionHorizontal() {
        //given
        board.getPiece().setDirection(Direction.EAST);
        board.getPiece().setHorizontalPosition(4);

        //when
        command.execute(board);

        //then
        assertEquals(Direction.EAST, board.getPiece().getDirection());
        assertEquals(4, board.getPiece().getHorizontalPosition());
        assertEquals(0, board.getPiece().getVerticalPosition());
    }

    @Test
    public void executeMoveCommandPieceNorthNotChangePositionVertical() {
        //given
        board.getPiece().setDirection(Direction.NORTH);
        board.getPiece().setVerticalPosition(4);

        //when
        command.execute(board);

        //then
        assertEquals(Direction.NORTH, board.getPiece().getDirection());
        assertEquals(0, board.getPiece().getHorizontalPosition());
        assertEquals(4, board.getPiece().getVerticalPosition());
    }

    @Test
    public void executeMoveCommandPieceWestNotChangePositionHorizontalBackward() {
        //given
        board.getPiece().setDirection(Direction.WEST);

        //when
        command.execute(board);

        //then
        assertEquals(Direction.WEST, board.getPiece().getDirection());
        assertEquals(0, board.getPiece().getHorizontalPosition());
        assertEquals(0, board.getPiece().getVerticalPosition());
    }

    @Test
    public void executeMoveCommandPieceSouthtNotChangePositionVerticalBackward() {
        //given
        board.getPiece().setDirection(Direction.SOUTH);

        //when
        command.execute(board);

        //then
        assertEquals(Direction.SOUTH, board.getPiece().getDirection());
        assertEquals(0, board.getPiece().getHorizontalPosition());
        assertEquals(0, board.getPiece().getVerticalPosition());
    }

}
