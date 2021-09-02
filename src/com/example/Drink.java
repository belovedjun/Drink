package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drink {
    /*정준이는 자판기에서 음료를 뽑아 먹으려 한다. 자판기에는 콜라, 사이다, 토레타의 3가지 종류 음료수가 있다. 각각의 금액은 600, 700, 900 원이다.
     정준이에게는 3000원이 있다. 그리고 자판기에서는 거스름돈이 나온다. 현재 자판기에 있는 돈은 34,700원이 있다. 각 음료수를 뽑아먹을 때마다 정준이가
     가진 돈은 그만큼 차감되고 돈이 부족하면 음료수를 뽑아먹을 수가 없다.
     정준이가 음료수를 뽑을 수 있을 만큼 뽑았을 때, 뽑은 음료수 리스트와 정준이의 남은 잔돈, 그 때의 자판기 잔금을 출력해라.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int money, 선택한음료수번호 , change = 0; // 들어갈 금액 , 선택될 음료 , 잔돈
        int amount = 34700;

        // TODO : 1. 돈 넣기
        System.out.println("금액을 입력하세요");
        money = scan.nextInt(); //user 가 가지고 있는 금액

        // TODO : 2.메뉴 선택
        System.out.println("메뉴 입력하세요.");
        System.out.println("1번 coke (600원)   2번 sprite (700원)   3번 torreta (900원)");
        선택한음료수번호 = scan.nextInt(); //user 가 선택한 음료수

        // todo : 2-1 음료수 만들기
        Can coke = new Can();
        coke.price = 600;
        coke.name = "콜라";
        coke.number = 1;

        Can sprite = new Can();
        sprite.price = 700;
        sprite.name = "사이다";
        sprite.number = 2;

        Can torreta = new Can();
        torreta.price = 900;
        torreta.name = "토레타";
        torreta.number = 3;

        // TODO : 음료수 리스트 만들기]

        List<Can> 음료수전체리스트 = new ArrayList<>();
        음료수전체리스트.add(coke);
        음료수전체리스트.add(sprite);
        음료수전체리스트.add(torreta);

        // TODO : 음료수 리스트 안의 음료수의 번호를 하나하나 확인해서 , 내가 찾는 음료수인지 여부 확인
        // 하나하나 찾을 때 = 반복문 사용
        Can 내가찾은그캔 = 내가입력한캔의번호와같은캔찾기(음료수전체리스트, 선택한음료수번호);

        // 내가찾은그캔의 가격과 유저가 자판기에 넣은 돈 비교

        boolean isSuccess = false; // 유저가 음료수를 뽑았는지 여부
        if(money >= 내가찾은그캔.price) {
            // 유저가 넣은 돈이 음료수 가격보다 같거나 커서, 정상적으로 음료수를 뽑을수 있을 때
            System.out.println(" 음료수 뽑았다 : " + 내가찾은그캔.name);
            // 더 뽑을건지 말건지
            System.out.println("1 : 더뽑기 / 2: 거스름돈 받고 그만 뽑기");
            int 더뽑을건지말건지 = scan.nextInt();
            if(더뽑을건지말건지 == 2){
                // 거스름돈 받고 그만 뽑기
                int 거스름돈 = money - 내가찾은그캔.price;
                System.out.println("거스름돈 : " + 거스름돈);
            }
        } else {
            System.out.println(" 음료수 못 뽑았다 - 부족한 금액 : " + (내가찾은그캔.price - money) );
        }










        // 금액 입력과 메뉴를 선택한이후 받게될 잔돈 구하기 또는 돈이 부족한지 확인하기

//        if(choice == 1 && money>coke) {
//            change = money - coke;
//            System.out.println("콜라를 구매했습니다");
//        } else if(choice == 2 && money>sprite) {
//            change = money - sprite;
//            System.out.println("사이다를 구매했습니다");
//        }else if (choice == 3 && money>torreta) {
//            change = money - torreta;
//            System.out.println("토레타를 구매했습니다.");
//        }else {
//            change = money;
//            System.out.println("돈이 부족합니다");
//        }
//        System.out.println("잔돈"+change+"원");
//        System.out.printf("자판기 보유금액 : %d원%n",amount);
    }

    static private Can 내가입력한캔의번호와같은캔찾기(List<Can> 음료수리스트, int 선택한음료수번호){
        for(Can 내가집은그캔 : 음료수리스트){
            // 찾으려고 하는 번호 == 내가 집은 그 캔의 번호
            if(선택한음료수번호 == 내가집은그캔.number){
                return 내가집은그캔;
            }
        }
        return null;
    }
}
