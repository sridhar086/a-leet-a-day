package com.sridhar.code.library.hard.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeetingRoomsIIITest {

    @Test
    void test1() {
        MeetingRoomsIII meetingRoomsIII = new MeetingRoomsIII();
        int[][] array = {{48,49},{22,30},{13,31},{31,46},{37,46},{32,36},{25,36},{49,50},{24,34},{6,41}};
        int n = 4;
        int returned = meetingRoomsIII.mostBooked(n, array);
        assertEquals(0, returned);
    }


}
