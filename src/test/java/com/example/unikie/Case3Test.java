package com.example.unikie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Case3Test {

    @Test
    void name() {

        Case3 case3 = new Case3();

        String[] T = {"course1", "course2a", "course5", "course2b", "course2c", "course6"};
        String[] R = {"OK", "Timeout", "OK", "OK", "OK", "Failed"};
        int actual = case3.solution(T, R);
        assertEquals(50, actual);

    }
}