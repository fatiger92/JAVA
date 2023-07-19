package chap_09;

import java.util.ArrayList;
import java.util.Iterator;


// 유재석 파이썬
// 박명수 자바
// 김종국 자바
// 조세호 C
// 서장훈 파이썬

// 자바 자격증을 보유한 학생
// 박명수
// 김종국

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        String selectedLicense = "파이썬";

        System.out.println(selectedLicense + " 자격증을 보유한 학생");
        System.out.println("-----------------------");

        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {
            Student student = it.next();
            if(student.getLicense().contains(selectedLicense)) {
                System.out.println(student.getName());
            }
        }
    }
}

class Student {
    private String name;
    private String license;
    public Student(String name, String license) {
        this.name = name;
        this.license = license;
    }
    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }
}