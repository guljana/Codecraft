package org.example;


public class MarsRover {

    private int x;
    private int y;
    private char direction;

    public MarsRover(int x, int y, char direction)
    {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    private void moveForward()
    {
        switch (direction) {
            case 'N':
                y += 1;
                break;
            case 'S':
                y -= 1;
                break;
            case 'E':
                x += 1;
                break;
            case 'W':
                x -= 1;
                break;
        }
    }
    private void moveBackward()
    {
        switch (direction) {
            case 'N':
                y -= 1;
                break;
            case 'S':
                y += 1;
                break;
            case 'E':
                x -= 1;
                break;
            case 'W':
                x += 1;
                break;
        }
    }
    private void turnLeft()
    {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
        }
    }

    public int[] getPosition()
    {
        return new int[]{x, y};
    }

    public void move(char dir)
    {
        if (dir == 'F') {
            moveForward();
        } else if (dir == 'B') {
            moveBackward();
            }
        }

    public void turn(char turnDir)
    {
        switch (turnDir) {
            case 'L':
                switch (direction) {
                    case 'N':
                        direction = 'W';
                        break;
                    case 'W':
                        direction = 'S';
                        break;
                    case 'S':
                        direction = 'E';
                        break;
                    case 'E':
                        direction = 'N';
                        break;
                }
                break;
            case 'R':
                switch (direction) {
                    case 'N':
                        direction = 'E';
                        break;
                    case 'E':
                        direction = 'S';
                        break;
                    case 'S':
                        direction = 'W';
                        break;
                    case 'W':
                        direction = 'N';
                        break;
                }
                break;
        }
    }

    public char getDirection()
    {
        return direction;
    }
}


