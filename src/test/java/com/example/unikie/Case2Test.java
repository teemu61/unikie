package com.example.unikie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Case2Test {

    @Test
    void name() {

        Case2 case2 = new Case2();
        int[] T = {1,20,-4,6,2,30,-10,-1};
        String actual = case2.solution(T);
        assertEquals(actual, "SUMMER");

    }
}