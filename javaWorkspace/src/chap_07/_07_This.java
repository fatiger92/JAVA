package chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "검둥이"; // 검둥이(최신형)
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);
    }
}
