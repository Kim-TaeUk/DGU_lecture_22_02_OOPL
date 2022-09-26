package week1;

import java.util.Scanner;   //Scanner class import

public class Week1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //객체를 생성하고, 입력한 값을 byte 단위로 받아들임

        String name = "";   //이름을 저장할 String 형의 변수 name 선언 및 빈 문자열로 초기화
        String studentNumber = "";  //학번을 저장할 String 형의 변수 studentNumber 선언 및 빈 문자열로 초기화
        String date = "";   //날짜를 저장할 String 형의 변수 date 선언 및 빈 문자열로 초기화
        String time = "";   //시간을 저장할 String 형의 변수 time 선언 및 빈 문자열로 초기화

        System.out.print("이름을 입력하시오 : ");   //입력 안내문 출력
        name = sc.nextLine();   //Scanner class 의 method nextLine()를 이용하여 변수 name 에 Enter 누르기 이전까지 입력한 값을 저장
        System.out.print("학번을 입력하시오 : ");   //입력 안내문 출력
        studentNumber = sc.nextLine();   //Scanner class 의 method nextLine()를 이용하여 변수 studentNumber 에 Enter 누르기 이전까지 입력한 값을 저장
        System.out.print("날짜를 입력하시오 : ");   //입력 안내문 출력
        date = sc.nextLine();   //Scanner class 의 method nextLine()를 이용하여 변수 date 에 Enter 누르기 이전까지 입력한 값을 저장
        System.out.print("시간을 입력하시오 : ");   //입력 안내문 출력
        time = sc.nextLine();   //Scanner class 의 method nextLine()를 이용하여 변수 time 에 Enter 누르기 이전까지 입력한 값을 저장

        System.out.println("이름은 " + name + " 입니다"); //출력문
        System.out.println("학번은 " + studentNumber + " 입니다"); //출력문
        System.out.println("날짜는 " + date + " 입니다"); //출력문
        System.out.println("시간은 " + time + " 입니다"); //출력문

        sc.close(); //Scanner 사용 종료
    }
}

