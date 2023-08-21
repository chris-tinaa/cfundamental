package org.bcafinance.ujian;

import java.util.Random;
import java.util.Scanner;

public class UjianJF11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Jumlah data format no handphone yang ingin di-generate : ");
        int dataCount = scanner.nextInt();

        StringBuilder phoneNum = new StringBuilder();

        for (int j = 0; j < dataCount; j++) {

            // 0 atau 62
            int res = rand.nextInt(1, 3);
            if (res == 1) {
                phoneNum.append("0");
            } else if (res == 2) {
                phoneNum.append("62");
            }

            phoneNum.append("8");

            String[] provider = {"23", "21", "52", "97", "57", "12"};
            phoneNum.append(provider[rand.nextInt(0, provider.length)]);

            phoneNum.append("-");

            for (int i = 0; i < 3; i++) {
                int number = rand.nextInt(0, 10);
                phoneNum.append(number);
            }

            phoneNum.append("-");

            int digit = rand.nextInt(10, 15);
            digit = digit - 7;

            for (int i = 0; i < digit; i++) {
                phoneNum.append(rand.nextInt(0, 10));
            }

            System.out.println(phoneNum);

            phoneNum.setLength(0);
        }

    }
}