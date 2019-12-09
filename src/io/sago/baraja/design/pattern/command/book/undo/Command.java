package io.sago.baraja.design.pattern.command.book.undo;

public interface Command {
    void execute();

    void undo();
}
