package com.example;

import jungjunclass.*;

public class Test {

    public static void main(String[] args) {
        Bakery p = new Bakery();
        p.cakePrice = 1000000;
        p.name = "파리크라상";

        System.out.println("파리크라상 케익 가격 : " + p.cakePrice);
        System.out.println("파리크라상 이름 : " + p.name);

        //======================================================//

        Clothes d = new Clothes(); //인스턴스 객체 이름은 내가 사용하기 나름이다. (한국어,영어)
        Clothes u = new Clothes();
        d.kind = "오픈카라티셔츠";
        d.company = "드로우핏";

        u.company = "유니클로";
        u.kind = "코트";

        Politician c = new Politician();
        Politician l = new Politician();
        c.career = "감사원장";
        c.advantage = "청렴";

        l.advantage = "똑똑함";
        l.career = "최고위원";

        Game o = new Game();
        Game s = new Game();
        o.name = "오버위치";
        o.kind = "FPS";

        s.name = "서든어택";
        s.kind = "FPS";

        Mayor v = new Mayor();
        Mayor e = new Mayor();
        v.jurisdiction = "서울특별시";
        v.name = "오세훈";

        e.jurisdiction = "부산광역시";
        e.name = "박형준";

        Disease a = new Disease();
        Disease m = new Disease();
        a.name = "코로나";
        a.classification = "호흡기 질환";

        m.name = "말라리아";
        m.classification = "혈액질환";

    }
}
