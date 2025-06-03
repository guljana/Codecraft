package org.example;

public enum Command {
    LEFT('L'),
    RIGHT('R'),
    FORWARD('F'),
    BACKWARD('B');

    private final char code;

    Command(char action) {
        this.code = action;
    }

    public char getCode() {
        return code;
    }

    public static Command fromChar(char c) {
        for (Command cmd : values()) {
            if (cmd.code == c) {
                return cmd;
            }
        }
        throw new IllegalArgumentException("Invalid command: " + c);
    }
}