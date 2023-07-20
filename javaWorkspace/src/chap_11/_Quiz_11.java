package chap_11;

// 발생 가능 문제의 2가지 조건
// 상품 구매 가능 시간, 상품 매진
// 각 문제에 대한 사용자 정의 예외 클래스 자게성
// 에러 코드에 따른 의도적 예외 발생 및 예외 처피
// 모든 클래스는 하나의 파일에 정의

// 에러코드
// 0 (에러 없음), 1 (판매 시간 아님), 2 (매진)

// 0 인 경우? 상품 구매를 완료하였습니다.
// 1 인 경우? 상품 구매 가능 시간이 아닙니다. / 상품 구매는 20시부터 가능합니다.
// 2 인 경우? 해당 상품은 매진되었습니다. / 다음 기회에 이용해주세요.

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 1;
        try {
            switch (errorCode)
            {
                case 0 :
                    System.out.println("상품 구매를 완료하였습니다.");
                    break;
                case 1:
                    throw new TimeoutException("상품 구매 가능 시간이 아닙니다.");
                case 2:
                    throw new SoldOutException("해당 상품은 매진되었습니다.");
            }
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시 부터 가능합니다.");

        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요." );
            e.getMessage();
        } catch (Exception e) {
            System.out.println("예상하지 못한 에러가 발생했습니다.");
        }
    }
}

class TimeoutException extends Exception {

    public TimeoutException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}