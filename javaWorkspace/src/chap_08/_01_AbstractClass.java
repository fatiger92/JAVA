package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract 
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)

        // Camera는 추상 클래스이기 때문에 객체로 만들 수 없음
        // Camera camera = new Camera();

        // 아래와 같이 자식 클래스를 객체로 만드는 것은 가능
        // Camera factoryCam = new FactoryCam();
        // factoryCam.showMainFeature();
        //
        // Camera speedCam = new SpeedCam();
        // speedCam.showMainFeature();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
