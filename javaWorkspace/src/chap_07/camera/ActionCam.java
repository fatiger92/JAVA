package chap_07.camera;

public final class ActionCam extends Camera {

    // final 선언시 값이 이미 초기화 되어있을 경우 해당 클래스 내부에서도 값 변경 불가능
    public final String lens = "광각렌즈";
    public ActionCam() {
        super("액션 카메라");
    }

    public final void makeVideo(){
        System.out.println(this.name + " : " + this.lens + "로 촬영한 멋진 비디오를 제작합니다.");
    }
}
