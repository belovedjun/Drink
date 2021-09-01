package com.example;

import java.util.Scanner;

public class Drink {
    /*정준이는 자판기에서 음료를 뽑아 먹으려 한다. 자판기에는 콜라, 사이다, 토레타의 3가지 종류 음료수가 있다. 각각의 금액은 600, 700, 900 원이다.
     정준이에게는 3000원이 있다. 그리고 자판기에서는 거스름돈이 나온다. 현재 자판기에 있는 돈은 34,700원이 있다. 각 음료수를 뽑아먹을 때마다 정준이가
     가진 돈은 그만큼 차감되고 돈이 부족하면 음료수를 뽑아먹을 수가 없다.
     정준이가 음료수를 뽑을 수 있을 만큼 뽑았을 때, 뽑은 음료수 리스트와 정준이의 남은 잔돈, 그 때의 자판기 잔금을 출력해라.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int money, choice , change = 0; // 들어갈 금액 , 선택될 음료 , 잔돈
        int coke = 600;
        int sprite = 700;
        int torreta  = 900;
        int balance = 34700;

        //금액 입력

        System.out.println("금액을 입력하세요");
        money = scan.nextInt();

        //메뉴 선택

        System.out.println("메뉴 입력하세요.");
        System.out.println("1번 coke (600원)   2번 sprite (700원)   3번 torreta (900원)");
        choice  = scan.nextInt();


        // 금액 입력과 메뉴를 선택한이후 받게될 잔돈 구하기 또는 돈이 부족한지 확인하기

        if(choice == 1 && money>coke) {
            change = money - coke;
        } else if(choice == 2 && money>sprite) {
            change = money - sprite;
        }else if (choice == 3 && money>torreta) {
            change = money - torreta;
        }else {
            change = money;
            System.out.println("돈이 부족합니다");
        }
        System.out.println("잔돈"+change+"원");
    }
}
