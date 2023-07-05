package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // if else 문을 이용 ( 여러 조건 또는 범위에 해당하는 조건 또는 조건이 3개 이하일 경우 )
        int ranking = 1; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        }
        else if(ranking == 2 || ranking == 3){
            System.out.println("반액 장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");


        // Switch Case 문을 이용 ( 명확한 케이스가 있는 경우 또는 조건이 3개 이상일 경우 )
        /*
        switch ( expression )
        {
            case A: ... 수행할 명령 ...
                break;
            case B: ... 수행할 명령 ...
                break;
            case C: ... 수행할 명령 ...
                break;
                ...
            default: ... 수행할 명령 ...
        }
        */
        ranking  = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
                break;
        }
        System.out.println("조회 완료 #2");

        // case 2 와 3을 통합
        ranking  = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
                break;
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade) {
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }

        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품의 가격 : 10000원
        // 2등급 제품의 가격 : 9000원
        // 3등급 제품의 가격 : 8000원

        // 만약 grade 가 1인 1등급일 경우 break가 case 3 아래 있으니 case 1의 시점에서 부터 price += 1000이 총 3번 실행된다.
        // grade 가 2라면 2의 시점 즉 case 2부터 2번 실행된다.
    }
}
