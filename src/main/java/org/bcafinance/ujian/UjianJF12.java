package org.bcafinance.ujian;

import java.util.Random;
import java.util.Scanner;

public class UjianJF12 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah data format email yang ingin di-generate : ");
        int dataCount = sc.nextInt();

        String[] provider = { "gmail", "ymail", "rocketmail", "yahoo" };
        String[] domain = { "com", "co.id", "us", "id", "jp" };

        int strLen;
        int intLen;
        int alfaLen;

        StringBuilder email = new StringBuilder();
        StringBuilder numeric = new StringBuilder();
        StringBuilder alfa1 = new StringBuilder();
        StringBuilder alfa2 = new StringBuilder();

        for (int j = 0 ; j < dataCount ; j++) {

            strLen = random.nextInt(10, 16);
            intLen = random.nextInt(2, 5);
            alfaLen = strLen - intLen;

            for (int i = 0; i < intLen; i++) {
                int rand = random.nextInt(0, 10);
                numeric.append(rand);
            }

            for (int i = 0; i < alfaLen; i++) {
                int rand = random.nextInt(97, 123);
                if (i < alfaLen / 2) {
                    alfa1.append((char) rand);
                } else {
                    alfa2.append((char) rand);
                }
            }

            // numeric di depan (0), tengah (1), belakang (2)
            int numPosition = random.nextInt(0, 3);

            if (numPosition == 0) {
                email.append(numeric).append(alfa1).append(alfa2);
            } else if (numPosition == 1) {
                email.append(alfa1).append(numeric).append(alfa2);
            } else if (numPosition == 2) {
                email.append(alfa1).append(alfa2).append(numeric);
            }

            email.append("@");

            email.append(provider[random.nextInt(0, provider.length)]);

            email.append(".");

            email.append(domain[random.nextInt(0, domain.length)]);

            System.out.println(email);

            email.setLength(0);
            numeric.setLength(0);
            alfa1.setLength(0);
            alfa2.setLength(0);
        }
    }
}
