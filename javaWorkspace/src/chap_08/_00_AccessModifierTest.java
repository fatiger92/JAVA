package chap_08;

import chap_07.*; // *을 쓸 경우 해당 패키지의 모든 클래스를 사용하겠다는 것임.

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "검둥이"; // public
        // b1.resolution = "FHD"; // default - 같은 패키지 내에서만 사용가능
        // b1.price = 200000; // private
        // b1.color = "블랙"; // protected

        BlackBox b2;
    }
}
