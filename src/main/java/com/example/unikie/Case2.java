package com.example.unikie;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**

 */
public class Case2 {

    public String solution(int[] T) {

        int step = T.length/4;

        List<Integer> list = Arrays.stream(T).boxed().collect(Collectors.toList());
        List<Integer> winter = list.subList(0, step);
        List<Integer> spring = list.subList(step , step*2);
        List<Integer> summer = list.subList(step*2, step*3);
        List<Integer> authum = list.subList(step*3, step*4);

        int ampWinter = getAmp(winter);
        int ampSpring = getAmp(spring);
        int ampSummer = getAmp(summer);
        int ampAuthum = getAmp(authum);

        return getMax(ampWinter, ampSpring, ampSummer, ampAuthum);

    }

    private int getAmp(List<Integer> sub) {

        int max = sub.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min = sub.stream().mapToInt(Integer::intValue).min().getAsInt();
        return max - min;
    }

    private String getMax(int win, int spr, int sum, int aut) {

        int max = 0;
        String result = "";

        if (win > max) {
            max = win;
            result = "WINTER";
        }

        if (spr > max) {
            max = spr;
            result = "SPRING";
        }

        if (sum > max) {
            max = sum;
            result = "SUMMER";
        }

        if (aut > max) {
            max = aut;
            result = "AUTUMN";
        }
        return result;
    }
}

