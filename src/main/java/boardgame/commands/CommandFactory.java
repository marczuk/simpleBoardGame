package boardgame.commands;

public interface CommandFactory {

    Command getCommand(char type);
}
