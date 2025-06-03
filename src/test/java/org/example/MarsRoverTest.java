package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    @Test
    void testRoverInitialPosition() {
        MarsRover marsRover = new MarsRover();
        assertArrayEquals(new int[]{0, 0}, MarsRover.moveRover(new int[]{0, 0}, "N", ""));
    }
}

