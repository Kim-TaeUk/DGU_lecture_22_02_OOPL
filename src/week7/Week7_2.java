package week7;

import java.util.Scanner;   //Scanner class import

class Lecture { // class Lecture 선언 및 구현
    private String sStudentName; // 멤버변수 sStudentName 선언
    private int sStudentNumber; // 멤버변수 sStudentNumber 선언
    private String sAttendance; // 멤버변수 sAttendance 선언

    public Lecture() {  // 기본 생성자

    }

    // 매개변수가 있는 생성자
    public Lecture(String sStudentName, int sStudentNumber) {
        this.sStudentName = sStudentName; // this 를 이용하여 매개변수 sStudentName 을 멤버변수 sStudentName 에 저장
        this.sStudentNumber = sStudentNumber; // this 를 이용하여 매개변수 sStudentNumber 을 멤버변수 sStudentNumber 에 저장
    }

    public String getsStudentName() {   // 멤버함수 getsStudentName 구현
        return sStudentName;  // sStudentName 을 리턴
    }

    public int getsStudentNumber() {   // 멤버함수 getsStudentNumber 구현
        return sStudentNumber;  // sStudentNumber 을 리턴
    }

    public void setsAttendance(String sAttendance) {   // 멤버함수 setsAttendance 구현
        this.sAttendance = sAttendance;
    }

    public String getsAttendance() {   // 멤버함수 getsAttendance 구현
        return sAttendance;  // sAttendance 을 리턴
    }

}

public class Week7_2 {
    public static void main(String[] args) {
        Scanner oInDev = new Scanner(System.in);    //객체를 생성하고, 입력한 값을 byte 단위로 받아들임

        Lecture[] myLecture = new Lecture[3];   // 크기가 3인 객체 배열 myLecture 생성
        myLecture[0] = new Lecture("김철수", 2022654321);
        // 객체 배열의 0번째 객체를 매개변수가 있는 생성자로 초기화
        myLecture[1] = new Lecture("이유리", 2022987956);
        // 객체 배열의 1번째 객체를 매개변수가 있는 생성자로 초기화
        myLecture[2] = new Lecture("이훈이", 2022456789);
        // 객체 배열의 2번째 객체를 매개변수가 있는 생성자로 초기화

        for (int i = 0; i < myLecture.length; i++) {
            System.out.println(myLecture[i].getsStudentName() + "의 출석 체크를 시작합니다.");
        }   // 문제 조건에 맞게 반복문으로 출력문 출력

        System.out.println("------------------------");

        for (int i = 0; i < myLecture.length; i++) {    // 반복문을 이용해
            String tempAttendance;  // 임시 String 선언
            System.out.println("이름 : " + myLecture[i].getsStudentName());
            System.out.println("학번 : " + myLecture[i].getsStudentNumber());

            System.out.print("출결(출석, 지각, 결석) : ");
            tempAttendance = oInDev.nextLine(); // 사용자가 입력한 것 임시 String 에 저장
            myLecture[i].setsAttendance(tempAttendance);    // 임시 String에 저장한 값을 멤버변수에 저장

            System.out.println();
        }
    }
}
