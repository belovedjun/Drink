package jungjunclass;

public class ClassTest {

    public static void main(String[] args) {
        Apartment 우성아파트 = new Apartment(); //인스턴스
        Apartment 타워펠리스  = new Apartment();
        Apartment 신원메트로빌 = new Apartment();
        우성아파트.name = "우성아파트"; // 인스턴스 값을 준것
        우성아파트.kind = "주상복합";
        우성아파트.floor = 10;

        타워펠리스.name = "타워펠리스";
        타워펠리스.kind = "주상복합";
        타워펠리스.floor = 40;

        신원메트로빌.name = "신원메트로빌";
        신원메트로빌.kind = "오피스텔";
        신원메트로빌.floor = 30;

        Bakery 파리바게트 = new Bakery();
        Bakery 뚜레쥬르 = new Bakery();
        Bakery 파리크라상 = new Bakery();

        파리바게트.name = "파리바게트";
        파리바게트.cakePrice = 10000;

        뚜레쥬르.name = "뚜레쥬르";
        뚜레쥬르.cakePrice = 20000;

        파리크라상.cakePrice = 30000;
        파리크라상.name = "파리크라상";

        System.out.println("파리크라상 케익값 : " + 파리크라상.cakePrice);

        //------------------------------------------------------------//

        Clothes 드로우핏 = new Clothes();
        Clothes 유니클로 = new Clothes();
        드로우핏.company = "드로우핏";
        드로우핏.kind = "오픈카라티셔츠";

        유니클로.company = "유니클로";
        유니클로.kind = "코트";

        Politician 최재형 = new Politician();
        Politician 이준석 = new Politician();
        최재형.advantage = "청렴";
        최재형.career = "감사원장";

        이준석.advantage = "똑똑함";
        이준석.career = "최고위원";

        Game 오버워치 = new Game();
        Game 서든어택 = new Game();

        오버워치.name = "오버워치";
        오버워치.kind = "FPS";

        서든어택.name = "서든어택";
        서든어택.kind = "FPS";

        Mayor 오세훈 = new Mayor();
        Mayor 박형준 = new Mayor();

        오세훈.jurisdiction = "서울특별시";
        오세훈.name = "오세훈";

        박형준.jurisdiction = "부산광역시";
        박형준.name = "박형준";

        Disease 코로나 = new Disease();
        Disease 말라리아 = new Disease();
        코로나.name = "코로나";
        코로나.classification = "호흡기질환";

        말라리아.name = "말라리아";
        말라리아.classification = "혈액질환";



    }
}
