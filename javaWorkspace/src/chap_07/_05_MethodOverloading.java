package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "검둥이";

        b1.Record(false, false, 10);
        System.out.println("-----------------------------");
        b1.Record(true, false, 3);
        System.out.println("-----------------------------");
        b1.Record(true,true, 5);
        System.out.println("-----------------------------");
        b1.Record();

        // String
        String s = "BlackBox";
        System.out.println(s.indexOf("a"));
    }
}
