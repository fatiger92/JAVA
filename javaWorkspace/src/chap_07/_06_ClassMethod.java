package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
//        BlackBox b1 = new BlackBox();
//        b1.CallServiceCenter();
//
//        BlackBox b2 = new BlackBox();
//        b2.CallServiceCenter();

        BlackBox.callServiceCenter();

        String s = String.valueOf(3); // 이것도 Static이 붙어있음.
    }
}
