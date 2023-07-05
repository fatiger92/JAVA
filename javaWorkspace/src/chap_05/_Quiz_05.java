package chap_05;

// 신발 사이즈는 250 부터 295 까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지

// 사이즈 250 (재고 있음)
// 사이즈 255 (재고 있음)
// ...

public class _Quiz_05 {
    public static void main(String[] args) {

/* 내가 생각한 답
        int[] sizes = new int[10];
        sizes[0] = 250;

        for (int i = 0; i < sizes.length; i++) {
            if(i != 0)
                sizes[i] = sizes[i - 1] + 5;
        }

        for (int i = 0; i < sizes.length; i++) {
            System.out.println("사이즈 " + sizes[i] + " (재고 있음)");
        }
*/
        
        // 정답
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + ( 5 * i );
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고있음)");
        }
    }
}
