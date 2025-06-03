package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest
{

    @Test
    void testRoverInitialPosition()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        assertArrayEquals(new int[]{0, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardNorth()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        marsRover.move('F');
        assertArrayEquals(new int[]{0, 1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardSouth()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'S');
        marsRover.move('F');
        assertArrayEquals(new int[]{0, -1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardEast()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        marsRover.move('F');
        assertArrayEquals(new int[]{1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardWest()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'W');
        marsRover.move('F');
        assertArrayEquals(new int[]{-1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardNorth()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        marsRover.move('B');
        assertArrayEquals(new int[]{0, -1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardWest()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'W');
        marsRover.move('B');
        assertArrayEquals(new int[]{1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardEast()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        marsRover.move('B');
        assertArrayEquals(new int[]{-1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardSouth()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'S');
        marsRover.move('B');
        assertArrayEquals(new int[]{0, 1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveLeftNorth()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'N');
       // marsRover.execute('L');
        assertEquals('W', marsRover.getDirection());
    }

    @Test
    void testRoverMoveLeftWest()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'W');
       // marsRover.turn('L');
        assertEquals('S', marsRover.getDirection());
    }

    @Test
    void testRoverMoveLeftSouth()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'S');
       // marsRover.turn('L');
        assertEquals('E', marsRover.getDirection());
    }

    @Test
    void testRoverMoveLeftEast()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'E');
       // marsRover.turn('L');
        assertEquals('N', marsRover.getDirection());
    }

    @Test
    void testRoverMoveRightNorth()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        //marsRover.turn('R');
        assertEquals('E', marsRover.getDirection());
    }
    @Test
    void testRoverMoveRightEast()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'E');
       // marsRover.turn('R');
        assertEquals('S', marsRover.getDirection());
    }

    @Test
    void testRoverMoveRightSouth()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'S');
        //marsRover.turn('R');
        assertEquals('W', marsRover.getDirection());
    }

    @Test
    void testRoverMoveRightWest()
    {
        MarsRover marsRover = new MarsRover(0, 0, 'W');
       // marsRover.turn('R');
        assertEquals('N', marsRover.getDirection());
    }

}

