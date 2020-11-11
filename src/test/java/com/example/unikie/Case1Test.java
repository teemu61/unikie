package com.example.unikie;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Case1Test {

    @Test
    void name() {

        Case1 f = new Case1();
        int[] A = {1,2,2,2,5,9};
        int actual  = f.solution(A, 5);
        assertEquals(4, actual);

    }
}
