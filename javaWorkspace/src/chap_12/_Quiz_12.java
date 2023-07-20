package chap_12;

// 상품 A와 상품 B로 이루어진 세트 상품을 효율적으로 포장하는 프로그램을 작성하시오

// 조건
// 상품 A와 상품 B는 각각 5개씩 준비
// 상품 A와 상품 B는 두 사람이 독립적으로 준비
// 상품 A와 상품 B가 모두 준비된 이후 세트 상품 포장 시작
// 포장이 필요한 세트 상품은 총 5개
// (필요 시)모든 클래스는 하나의 파일에 정의

/*
A 상품 준비 1/5
B 상품 준비 1/5
...
-- A 상품 준비 완료 --
-- B 상품 준비 완료 --
== 세트 상품 포장 시작 ==
세트 상품 포장 1/5
...
== 세트 상품 포장 완료 ==
 */

/* 내생각
public class _Quiz_12 {
    public static void main(String[] args) {
        Product productA = new Product();
        Product productB = new Product();
        Product productC = new Product();

        Runnable employee1 = () -> {
            for (int i = 1; i <= 5; i++) {
                productA.ready("A");
            }
            System.out.println(" -- A 상품 준비 완료 -- ");
        };

        Runnable employee2 = () -> {
            for (int i = 1; i <= 5; i++) {
                productB.ready("B");
            }
            System.out.println(" -- B 상품 준비 완료 -- ");
        };

        Thread thread1 = new Thread(employee1);
        Thread thread2 = new Thread(employee2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        productC.packaging();
    }
}

class Product {
    int count = 1;
    int max = 5;
    synchronized public void ready(String name) {
        System.out.println(name + " 상품 준비 " + count + "/" + max);
        count++;
    }

    public void packaging() {
        System.out.println(" == 세트 상품 포장 시작 ==");
        for (int i = 1; i <= max; i++) {
            System.out.println("세트 상품 포장 " + i + "/" + max);
        }
        System.out.println(" == 세트 상품 포장 완료 ==");
    }
}
*/


public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable runnableA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            }
            System.out.println(" -- A 상품 준비 완료 -- ");
        };

        Runnable runnableB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println(" -- B 상품 준비 완료 -- ");
        };

        Runnable runnableSet = () -> {
            System.out.println(" -- 세트 상품 포장 시작 -- ");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println(" -- 세트 상품 포장 완료 -- ");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

        // join 과 같은 효과
//        while (threadA.isAlive() || threadB.isAlive()) {
//        }

        try {
            threadA.join(); // 기다림
            threadB.join(); // 기다림
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread threadSet = new Thread(runnableSet);
        threadSet.start();
    }
}