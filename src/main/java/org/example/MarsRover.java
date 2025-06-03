package org.example;

public class MarsRover {

    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = Direction.valueOf(String.valueOf(direction));
    }

    private void moveForward() {
        switch (direction) {
            case N: y += 1; break;
            case S: y -= 1; break;
            case E: x += 1; break;
            case W: x -= 1; break;
        }
    }

    private void moveBackward() {
        switch (direction) {
            case N: y -= 1; break;
            case S: y += 1; break;
            case E: x -= 1; break;
            case W: x += 1; break;
        }
    }

    public void execute(Command command) {
        switch (command) {
            case FORWARD: moveForward(); break;
            case BACKWARD: moveBackward(); break;
            case LEFT: direction = direction.turnLeft(); break;
            case RIGHT: direction = direction.turnRight(); break;
        }
    }

    public void move(char dir) {
        execute(Command.fromChar(dir));
    }

    public int[] getPosition() {
        return new int[]{x, y};
    }

    public char getDirection() {
        return direction.name().charAt(0);
    }
}