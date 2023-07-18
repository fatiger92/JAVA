package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스

        // Wrapper Class (String 제외)
        // 프로그램에 따라 기본 타입의 데이터를 객체 취급해야 하는 경우가 있음.
        // 예를 들어 메소드의 인수로 객체 타입만이 요구되면, 기본 타입의 데이터를 그대로 사용할 수는 없음.
        // 이때 기본 타입의 데이터를 먼저 객체로 변환(박싱)한 후 작업을 수행해야 함.
        // 기본 타입의 데이터를 Wrapper Class 의 인스턴스로 변환하는 과정을 박싱(Boxing)이라고 한다.
        // 반면 Wrapper Class 의 인스턴스에 저장된 값을 다시 기본 탕비의 데이터로 꺼내는 과정을 언박싱(UnBoxing) 이라고 한다.

        // byte(기본) -> Byte(객체)
        // short(기본) -> Short(객체)
        // int(기본) -> Integer(객체)
        // long(기본) -> Long(객체)
        // float(기본) -> Float(객체)
        // double(기본) -> Double(객체)
        // char(기본) -> Character(객체)
        // boolean(기본) -> Boolean(객체)

        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("--------------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T : Type, K : Key, V : Value, E : Element
    private static <T> void printAnyArray(T[] array) {
        for(T t : array) {
            System.out.print(t + " ");
         }
        System.out.println();
    }
    private static void printStringArray(String[] sArray) {
        for(String s : sArray) {
            System.out.print(s + " "); // A B C D E
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for(Double d : dArray) {
            System.out.print(d + " "); // 1.0 2.0 3.0 4.0 5.0
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for(int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }
}
