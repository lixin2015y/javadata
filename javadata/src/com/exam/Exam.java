package com.exam;

public class Exam {
    public static boolean checkDifferent(String iniString) {
        for (int i = 0; i < iniString.length(); i++) {
            for (int j = i + 1; j < iniString.length(); j++) {
                if (String.valueOf(iniString.charAt(i)).equals(String.valueOf(iniString.charAt(j)))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(checkDifferent(str));
    }
}
