package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    @Test
    void testRoverInitialPosition() {
        MarsRover marsRover = new MarsRover(0,0,'N');
        assertArrayEquals(new int[]{0, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardNorth(){
        MarsRover marsRover = new MarsRover(0,0,'N');
        marsRover.move('F');
        assertArrayEquals(new int[]{0, 1}, marsRover.getPosition());
    }
    @Test
    void testRoverMoveForwardSouth() {
        MarsRover marsRover = new MarsRover(0,0,'S');
        marsRover.move('F');
        assertArrayEquals(new int[]{0, -1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardEast() {
        MarsRover marsRover = new MarsRover(0,0,'E');
        marsRover.move('F');
        assertArrayEquals(new int[]{1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardWest() {
        MarsRover marsRover = new MarsRover(0,0,'W');
        marsRover.move('F');
        assertArrayEquals(new int[]{-1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardNorth() {
        MarsRover marsRover = new MarsRover(0,0,'N');
        marsRover.move('B');
        assertArrayEquals(new int[]{0, -1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardWest() {
        MarsRover marsRover = new MarsRover(0,0,'W');
        marsRover.move('B');
        assertArrayEquals(new int[]{1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardEast() {
        MarsRover marsRover = new MarsRover(0,0,'E');
        marsRover.move('B');
        assertArrayEquals(new int[]{-1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardSouth() {
        MarsRover marsRover = new MarsRover(0,0,'S');
        marsRover.move('B');
        assertArrayEquals(new int[]{0, 1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveLeftNorth() {
        MarsRover marsRover = new MarsRover(0,0,'N');
        marsRover.turn('L');
        assertEquals('W', marsRover.getDirection());
    }

}

