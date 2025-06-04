package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    @Test
    void testRoverInitialPosition() {
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        assertArrayEquals(new int[]{0, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardNorth() {
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        marsRover.move('F');
        assertArrayEquals(new int[]{0, 1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardSouth() {
        MarsRover marsRover = new MarsRover(0, 0, 'S');
        marsRover.move('F');
        assertArrayEquals(new int[]{0, -1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardEast() {
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        marsRover.move('F');
        assertArrayEquals(new int[]{1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveForwardWest() {
        MarsRover marsRover = new MarsRover(0, 0, 'W');
        marsRover.move('F');
        assertArrayEquals(new int[]{-1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardNorth() {
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        marsRover.move('B');
        assertArrayEquals(new int[]{0, -1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardSouth() {
        MarsRover marsRover = new MarsRover(0, 0, 'S');
        marsRover.move('B');
        assertArrayEquals(new int[]{0, 1}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardEast() {
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        marsRover.move('B');
        assertArrayEquals(new int[]{-1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverMoveBackwardWest() {
        MarsRover marsRover = new MarsRover(0, 0, 'W');
        marsRover.move('B');
        assertArrayEquals(new int[]{1, 0}, marsRover.getPosition());
    }

    @Test
    void testRoverTurnLeftFromNorth() {
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        marsRover.move('L');
        assertEquals('W', marsRover.getDirection());
    }

    @Test
    void testRoverTurnLeftFromWest() {
        MarsRover marsRover = new MarsRover(0, 0, 'W');
        marsRover.move('L');
        assertEquals('S', marsRover.getDirection());
    }

    @Test
    void testRoverTurnLeftFromSouth() {
        MarsRover marsRover = new MarsRover(0, 0, 'S');
        marsRover.move('L');
        assertEquals('E', marsRover.getDirection());
    }

    @Test
    void testRoverTurnLeftFromEast() {
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        marsRover.move('L');
        assertEquals('N', marsRover.getDirection());
    }

    @Test
    void testRoverTurnRightFromNorth() {
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        marsRover.move('R');
        assertEquals('E', marsRover.getDirection());
    }

    @Test
    void testRoverTurnRightFromEast() {
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        marsRover.move('R');
        assertEquals('S', marsRover.getDirection());
    }

    @Test
    void testRoverTurnRightFromSouth() {
        MarsRover marsRover = new MarsRover(0, 0, 'S');
        marsRover.move('R');
        assertEquals('W', marsRover.getDirection());
    }

    @Test
    void testRoverTurnRightFromWest() {
        MarsRover marsRover = new MarsRover(0, 0, 'W');
        marsRover.move('R');
        assertEquals('N', marsRover.getDirection());
    }
}
