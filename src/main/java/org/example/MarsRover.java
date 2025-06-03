package org.example;


public class MarsRover
{

    private int x;
    private int y;
    private Direction direction;
    private Command command;

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

    public void move(char dir) {
        if (dir == 'F') {
            moveForward();
        } else if (dir == 'B') {
            moveBackward();
        }
    }

    public void turn(char turnDir) {
        if (turnDir == 'L') {
            direction = direction.turnLeft();
        } else if (turnDir == 'R') {
            direction = direction.turnRight();
        }
    }

    public int[] getPosition() {
        return new int[]{x, y};
    }

    public char getDirection() {
        return direction.name().charAt(0);
    }
}



