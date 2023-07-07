package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "흰둥이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "검둥이";
        System.out.println(b2.modelName);
        
        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println(" - 개발 전 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // 기능 개발
        BlackBox.canAutoReport = true; // BlackBox 클래스 변수 값 변경 시, 해당 클래스로 만들어진 모든 인스턴스의 클래스 변수 값이 변경됨.

        System.out.println(" - 개발 후 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport); // 권장

    }
}
