package com.sridhar.code.library.acompany.oracle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementFromSortedMatrixTest {

    @Test
    void testv2() {
        KthSmallestElementFromSortedMatrix kthSmallestElementFromSortedMatrix = new KthSmallestElementFromSortedMatrix();
        int returned = kthSmallestElementFromSortedMatrix.kthSmallest(new int[][]{{1,3,5},{6,7,12},{11,14,14}}, 8);
        assertEquals(14, returned);
    }

    @Test
    void testv3() {
        KthSmallestElementFromSortedMatrix kthSmallestElementFromSortedMatrix = new KthSmallestElementFromSortedMatrix();
        int returned = kthSmallestElementFromSortedMatrix.kthSmallest(new int[][]{{1,2,3,7},{5,10,14,16},{8,10,18,19},{9,12,22,24}}, 14);
        assertEquals(19, returned);
    }


}
