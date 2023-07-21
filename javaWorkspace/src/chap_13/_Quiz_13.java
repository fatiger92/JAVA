package chap_13;

// 속담 퀴즈 프로그램을 작성하시오.

// 조건
// 퀴즈 내용은 saying.txt 라는 이름의 파일로 제공
// 퀴즈는 문제와 정답이 각각 한 줄로 구성 (퀴즈 3개인 경우 총 6줄)
// 사용자로부터 값을 입력 받아 정답여부 확인
// 오답인 경우 정답 안내
// 퀴즈 내용이 더 이상 없을 때까지 반복

// 세 살 __ 여든까지 간다
// 버릇
// 소 잃고 __ 고친다
// 외양간
// 천 리 길도 한 __ 부터
// 걸음

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)
-----------------------------------------------------
(문제) 세 살 __ 여든까지 간다.
  정답 입력 => 버릇
정답입니다!!

(문제) 소 잃고 ___ 고친다
  정답 입력 => 화장실
틀렸습니다. 정답은 외양간입니다.

(문제) 천 리 길도 한 __부터
  정답 입력 => 걸음
정답입니다!!

-----------------------------------------------------
모든 퀴즈가 완료되었습니다.
수고하셨습니다. ^^

 */

/* 내 답변
public class _Quiz_13 {
    public static void main(String[] args) {
        createFile("saying.txt");
        File quiz = findFile("saying.txt");
        quizStart(quiz);
    }
    public static void createFile(String fileName) {
        File file = new File(fileName);

        if(file.isFile() && file.length() != 0) {
            System.out.println(fileName + " 파일이 존재합니다.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("세 살 __ 여든까지 간다\n");
            bw.write("버릇\n");
            bw.write("소 잃고 ___ 고친다\n");
            bw.write("외양간\n");
            bw.write("천 리 길도 한 __ 부터\n");
            bw.write("걸음\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static File findFile(String filePath) {

        File file = new File(filePath);
        if(file.isFile() == false) {
            System.out.println("파일을 찾지 못했습니다.");
            return null;
        } else {
            System.out.println("파일을 찾았습니다.");
        }
        return file;
    }

    public static void quizStart(File quizFile) {

        ArrayList<String> lists = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(quizFile))) {
            String line;
            while ((line = br.readLine()) != null ) {
                lists.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
        System.out.println("---------------------------------------------------------");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < lists.size(); i += 2) {
            System.out.println("(문제)" + lists.get(i));
            System.out.print("정답 입력 => ");
            String answer = sc.nextLine();

            if(lists.get(i + 1).equals(answer)) {
                System.out.println("정답 입니다!!!");
            } else {
                System.out.println("틀렸습니다. 정답은 [" + lists.get(i + 1) + "]입니다.");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("모든 퀴즈가 완료되었습니다. \n 수고하셨습니다. ^^");
    }
}
*/

public class _Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader("src/chap_13/saying.txt"))) {
            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
            System.out.println("-----------------------------------------------------");

            String quiz; // 문제
            String answer; // 정답
            String input; // 사용자 입력

            while (true) {
                quiz = br.readLine();
                answer = br.readLine();

                if(quiz == null || answer == null){
                    break;
                }

                System.out.println("(문제) " + quiz);
                System.out.print("  정답 입력 => ");
                input = sc.next();

                if(input.equals(answer)) {
                    System.out.println("정답입니다.\n");
                } else {
                    System.out.println("틀렸습니다 정답은 " + answer + "입니다.\n");
                }
            }

            System.out.println("-----------------------------------------------------");
            System.out.println("모든 퀴즈가 완료되었습니다.");
            System.out.println("수고하셨습니다. ^^");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}