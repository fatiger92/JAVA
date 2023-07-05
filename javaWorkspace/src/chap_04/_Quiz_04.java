package chap_04;

public class _Quiz_04 {

    /*
    public enum eType
    {
        None, Normal, Small, Disabled
    }


    public static void main(String[] args) {
        int defaultPay = 4000;
        int curPay = 0;
        int max = 30000;
        int hour = 10;
        eType type = eType.Disabled;

        for (int i = 0; i < hour; i++) {

            if(curPay >= max){
                curPay = max;
                continue;
            }
            curPay += defaultPay;
        }

        switch (type)
        {
            case Normal:
                System.out.println("주차요금은 " + curPay + " 입니다.");
                break;
            case Small:
            case Disabled:
                System.out.println("할인 적용된 주차 요금은 " + DisCount(curPay) + " 입니다.");
                break;
        }

    }

    public static int DisCount(int pay) {
        return pay / 2;
    }
     */

    public static void main(String[] args) {
        // 답안
        int hour = 10; // 주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부
        
        int fee = hour * 4000; // 주차 정산 요금 (시간당 4000 원 곱하기)
        
        // 30000 원 초과 시 일일 최대 요금으로 수정
        if(fee > 30000) {
            fee = 30000; // 일일 최대 요금 적용
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if(isSmallCar || withDisabledPerson) {
            fee /= 2;
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + " 원입니다.");
    }
}
