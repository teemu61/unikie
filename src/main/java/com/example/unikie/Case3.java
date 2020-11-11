package com.example.unikie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Case3 {

    public int solution(String[] T, String[] R) {

        List<String> failed = new ArrayList<>();
        List<String> passed = new ArrayList<>();

        for(int i=0; i < R.length; i++) {
            if (!R[i].equals("OK")) {
                failed.add(T[i]);
            } else {
                passed.add(T[i]);
            }
        }

        List<String> failedDist = failed.stream().map(i -> removeLastChar(i)).distinct().collect(Collectors.toList());
        List<String> passedDist = passed.stream().map(i -> removeLastChar(i)).filter(i-> !failedDist.contains(i)).distinct().collect(Collectors.toList());

        int fail = failedDist.size();
        int pass = passedDist.size();
        int all = fail + pass;

        return pass*100/all;

    }

    private String removeLastChar(String str) {
        Boolean isDigit = Character.isDigit(str.charAt(str.length()-1));

        if (isDigit){
            return str;
        } else {
            return str.substring(0, str.length()-1);
        }
    }

}
