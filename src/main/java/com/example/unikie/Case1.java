package com.example.unikie;

public class Case1 {

    int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        System.out.println("initial r: " +r);

        while (l < r) {

            //int m = (l + r) / 2;      //this was the fault to be found
            int m = (int) Math.ceil( (float)(l + r) / 2);

            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }

        if (A[l] == X) return l;
        return -1;
    }
}

