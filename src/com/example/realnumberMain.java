package com.example;

public class realnumberMain {

    public static void main(String[] args) {
        /*
           어느 자료형에 저장하냐에 따라
           실수의 정밀도가 달라진다.
           실수는 오차가 존재하기 때문에
           특별한 경우가 아니면 정수형 자료형을 사용합니다.
        */
        float num1 = 32.12345678F;
        System.out.println(num1);

        double num2 = 32.12345678;
        System.out.println(num2);

        // 원래 double이었던 a를 float 만든 값을 float b의 값으로 넣어준다 (명시적 형변환)
    }
}
