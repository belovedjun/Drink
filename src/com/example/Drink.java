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

        int money, 선택한음료수번호 , change = 0; // 들어갈 금액 , 선택될 음료수번호(choice), 잔돈
        int amount = 34700; // 자판기 보유 잔금

        // TODO : 1. 돈 넣기
        System.out.println("금액을 입력하세요"); //"금액을 입력하세요" 라는 실행문(데이터)이 출력된다.
        money = scan.nextInt(); //user 가 가지고 있는 금액(int)을 입력한다

        // TODO : 2.메뉴 선택
        System.out.println("메뉴 입력하세요."); //"메뉴를 입력하세요" 라는 실행문(데이터)이 출력된다.
        System.out.println("1번 coke (600원)   2번 sprite (700원)   3번 torreta (900원)"); //23번라인 실행문과 함께 1번(coke) 600원, 2번(sprite) 700원, 3번(torreta) 900원 실행문이 함께 출력된다.
        선택한음료수번호 = scan.nextInt(); //user 가 선택한 음료수 번호(int)를 입력한다.

        // todo : 2-1 음료수 만들기
        Can coke = new Can(); //class Can의 coke는 new Can이다. 객체 선언 및 생성
        coke.price = 600; // coke의 가격은 600이다.
        coke.name = "콜라"; // coke의 이름은 콜라이다.
        coke.number = 1; // coke의 번호는 1이다.

        Can sprite = new Can(); // class Can의 sprite는 new Can이다. 객체 선언 및 생성
        sprite.price = 700; // sprite의 가격은 700이다.
        sprite.name = "사이다"; // sprite의 이름은 사이다.
        sprite.number = 2; // sprite의 번호는 2다.

        Can torreta = new Can(); // class Can의 sprite는 new Can이다. 객체 선언 및 생성
        torreta.price = 900; // torreta의 가격은 900이다.
        torreta.name = "토레타"; // torreta의 이름은 토레타.
        torreta.number = 3; // torreta의 번호는 3이다.

        // TODO : 음료수 리스트 만들기

        List<Can> 음료수전체리스트 = new ArrayList<>(); // 음료수 목록의 음료수 전체리스트는 new ArrayList이다.  객체 선언 및 생성
        음료수전체리스트.add(coke); // 음료수 전체 리스트에 coke를 추가한다.
        음료수전체리스트.add(sprite); // 음료수 전체 리스트에 sprite를 추가한다.
        음료수전체리스트.add(torreta); // 음료수 전체 리스트에 torreta를 추가한다.

        // TODO : 음료수 리스트 안의 음료수의 번호를 하나하나 확인해서 , 내가 찾는 음료수인지 여부 확인
        // 하나하나 찾을 때 = 반복문 사용
        Can 내가찾은그캔 = 내가입력한캔의번호와같은캔찾기(음료수전체리스트, 선택한음료수번호); // class Can 에 내가 찾은 그 캔은
                                                                                //내가 입력한 캔의 번호와 같은 캔(음료수 전체 리스트, 선택한 음료수 번호)을 찾을수 있도록 먼저 객체를 선언 하고 생성한다.

        // 내가찾은그캔의 가격과 유저가 자판기에 넣은 돈 비교

        boolean isSuccess = false; // 유저가 음료수를 뽑았는지 여부를 체크한다.
        if(money >= 내가찾은그캔.price) { // 유저가 넣은 돈(money)이 (내가 찾은 그 캔)의 가격보다 같거나 큰지 확인하는 if 조건문이다.
            System.out.println(" 음료수 뽑았다 : " + 내가찾은그캔.name); // 유저가 넣은 돈이 음료수 가격(내가 찾은 그 캔)의 가격보다 같거나 크면 정상적으로 "음료수 뽑았다 : 내가 선택한 캔의 이름"이 출력된다.
            System.out.println("1 : 더뽑기 / 2: 거스름돈 받고 그만 뽑기"); // 남은 돈으로 더 추가로 선택해서 음료수를 뽑을건지 아니면 거스름돈 받고 그만 뽑을건지 선택하는 1,2 출력문이 나온다.
            int 더뽑을건지말건지 = scan.nextInt(); // 더 뽑을 건지 말건지 1,2(int)번 중에 하나를 입력할수 있다.
            if(더뽑을건지말건지 == 2){ // 거스름돈 받고 그만 뽑기 2번을 선택했을시에 if 조건문이다.
                // 거스름돈 받고 그만 뽑기
                int 거스름돈 = money - 내가찾은그캔.price; // 거스름돈은 내가 넣은 돈 - 내가 찾은 그 캔의 가격으로 계산한다.
                System.out.println("거스름돈 : " + 거스름돈); // 64라인에서 계산한 값이 "거스름돈 : money - 내가 찾은 그캔 가격" 으로 출력된다.
            }
        } else {
            System.out.println(" 음료수 못 뽑았다 - 부족한 금액 : " + (내가찾은그캔.price - money) ); // 위에 조건과 달리 내가 넣은 금액보다 내가 찾은 그 캔의 가격이 높을시
                                                                                              // 음료수를 못 뽑았다는 문장과 부족한 금액이 출력된다.
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

    static private Can 내가입력한캔의번호와같은캔찾기(List<Can> 음료수리스트, int 선택한음료수번호){ // 내가 입력한 캔의 번호와 같은 캔을 찾을때 내부의 값 음료수 리스트안에 음료수랑 선택한 음료수 번호를 통해 찾는다.
        for(Can 내가집은그캔 : 음료수리스트){ //내가 집은 그캔이 음료수 리스트에 있는지 확인하는 for 반복문을 실행한다.
            // 찾으려고 하는 번호 == 내가 집은 그 캔의 번호
            if(선택한음료수번호 == 내가집은그캔.number){ // 내가 선택한 음료수 번호가 내가 집은 캔의 번호랑 같은지 확인하는 if 반복문을 실행한다.
                return 내가집은그캔; // 번호가 일치할시 내가 집은 그 캔의 값이 반환된다.
            }
        }
        return null; // 내가 집은 그캔의 값을 반환한다.
    }
}
