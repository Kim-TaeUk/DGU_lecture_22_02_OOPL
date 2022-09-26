package week2;

import java.util.Scanner;   //Scanner class import

class Monitor { // class Monitor 선언 및 구현
    // field
    String companyName; // 멤버변수 companyName 선언
    int size;   // 멤버변수 size 선언

    // method
    public Monitor() {  // 기본 생성자
    }

    public void setCompanyName(String companyName) { // 멤버함수 setCompanyName 구현
        this.companyName = companyName; // this 를 이용하여 매개변수 companyName 을 멤버변수 companyName 에 저장
    }

    public void setSize(int size) { // 멤버함수 setSize 구현
        this.size = size; // this 를 이용하여 매개변수 size 를 멤버변수 size 에 저장
    }

    public String getCompanyName() { // 멤버함수 getCompanyName 구현
        return this.companyName;    // companyName 을 return
    }

    public int getSize() { // 멤버함수 getSize 구현
        return this.size;    // size 을 return
    }
}

public class Week2_1 {
    public static void main(String[] args) {
        String companyName; // 제조사를 입력받을 변수 companyName 선언
        int size;   // 모니터 인치를 입력받을 변수 size 선언
        Scanner oInDev = new Scanner(System.in);    //객체를 생성하고, 입력한 값을 byte 단위로 받아들임
        Monitor oMonitor = new Monitor();   // Monitor 클래스의 객체 oMonitor 생성

        System.out.print("제조사를 입력하시오 : ");  // 입력 안내문
        companyName = oInDev.next();    // companyName 입력 받기
        oMonitor.setCompanyName(companyName);   // setter 이용하여 매개변수 companyName 을 멤버변수 companyName 에 저장


        System.out.print("모니터 인치를 입력하시오 : ");  // 입력 안내문
        size = oInDev.nextInt();    // size 입력 받기
        oMonitor.setSize(size);   // setter 이용하여 매개변수 size 를 멤버변수 size 에 저장

        System.out.print(oMonitor.getCompanyName() + " 모니터, " + oMonitor.getSize() + "인치 주문요청 완료");
        // 결과 출력
    }
}



