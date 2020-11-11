package com.example.unikie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Case3 {

    public int solution(String[] T, String[] R) {

        List<String> listT = Arrays.stream(T).collect(Collectors.toList());
        List<String> listR = Arrays.stream(R).collect(Collectors.toList());

        List<String> failed = new ArrayList<>();
        List<String> passed = new ArrayList<>();

        for(int i=0; i < listR.size(); i++) {
            if (!listR.get(i).equals("OK")) {
                failed.add(listT.get(i));
            } else {
                passed.add(listT.get(i));
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
