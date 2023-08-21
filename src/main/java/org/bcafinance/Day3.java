package org.bcafinance;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        String words;
        int asciiSum = 0;
        int ascii;

        System.out.print("Masukkan Kata : ");

        Scanner scanner = new Scanner(System.in);
        words = scanner.nextLine();

        char[] chArr = words.toCharArray();

        for (int i = 0 ; i < chArr.length ; i++){
              ascii = chArr[i];
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                asciiSum += ascii;
            }
        }
        System.out.println(asciiSum);
    }
}

/*
Speed 90 K/M = 649

50 Korban 3 Begal = 1080
*/
