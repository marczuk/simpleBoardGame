package boardgame.games;

import boardgame.boards.Board;
import boardgame.commands.Command;
import boardgame.commands.CommandFactory;

public abstract class BoardGame {
    private final Board board;
    private final CommandFactory commandFactory;

    public BoardGame(Board board, CommandFactory commandFactory) {
        this.board = board;
        this.commandFactory = commandFactory;
    }
    
    public String executeCommands(String commands) {
        //iterate on chars in string

        for (char charCommand : commands.toCharArray()) {
            executeCommand(charCommand);
        }

        return getResult();
    }

    private void executeCommand(char charCommand) {

        Command command = commandFactory.getCommand(charCommand);
        command.execute(board);
    }

    protected String getResult(){
        StringBuilder result = new StringBuilder();
        result.append(board.getPiece().getHorizontalPosition()).append(" ");
        result.append(board.getPiece().getVerticalPosition()).append(" ");
        result.append(board.getPiece().getDirection().getShortName());

        return result.toString();
    }
}
