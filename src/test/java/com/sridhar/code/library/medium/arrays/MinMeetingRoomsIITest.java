package com.sridhar.code.library.medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MinMeetingRoomsIITest {

    @Test
    void testv2() {
        MinMeetingRoomsII minMeetingRoomsII = new MinMeetingRoomsII();
        int[][] array = new int[][]{{0,30},{5,10},{15,20}};
        int rooms = minMeetingRoomsII.minMeetingRooms(array);
        Assertions.assertEquals(3, rooms);
    }
}
