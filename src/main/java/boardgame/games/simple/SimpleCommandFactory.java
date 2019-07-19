package boardgame.games.simple;

import boardgame.commands.*;

public class SimpleCommandFactory implements CommandFactory {
    public Command getCommand(char type) {
        Command command = null;
        switch(type) {
            case 'M' :
                command = new MoveCommand();
                break;
            case 'R' :
                command = new RightCommand();
                break;
            case 'L' :
                command = new LeftCommand();
                break;
        }

        return command;
    }
}
