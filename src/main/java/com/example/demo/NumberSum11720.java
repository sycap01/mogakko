package com.example.demo;

import java.util.Scanner;

public class NumberSum11720 {
    void numberSum() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // char[i]를 정수형으로 변환하기
        }
        System.out.println(sum);
    }
}
