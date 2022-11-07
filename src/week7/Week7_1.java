package week7;

import java.util.Scanner;   //Scanner class import
class Sphere { // class Sphere 선언 및 구현
    private int radius; // 멤버변수 radius 선언
    private double volume; // 멤버변수 volume 선언

    public void setRadius(int radius) { // 멤버함수 setRadius 구현
        this.radius = radius; // this 를 이용하여 매개변수 radius 을 멤버변수 radius 에 저장
    }

    public void setVolume() {   // 멤버함수 setVolume 구현
        volume = (double) (4 / 3) * Math.PI * radius * radius * radius;
        // volume 을 원의 부피 공식에 맞게 계산
    }

    public double getVolume() { // 멤버함수 getVolume 구현
        return volume;  // volume 을 리턴
    }

}

public class Week7_1 {
    public static void main(String[] args) {
        Scanner oInDev = new Scanner(System.in);    //객체를 생성하고, 입력한 값을 byte 단위로 받아들임
        int count = 0;  // 765cm^3보다 큰 구의 개수를 저장할 변수 count 0으로 초기화
        int iInputRadius;
        Sphere[] mySphere = new Sphere[5];  // 크기가 5인 객체 배열 mySphere 선언

        for (int i = 0; i < 5; i++) {   // 반복문을 이용해
            System.out.print("구 " + (i + 1) + "의 반지름 : ");
            mySphere[i] = new Sphere(); // 객체를 하나씩 생성
            iInputRadius = oInDev.nextInt();    // 입력 받은 반지름 값 저장하고
            mySphere[i].setRadius(iInputRadius);    // setter 로 멤버변수에 저장
            mySphere[i].setVolume();    // 멤버함수 이용하여 부피 구함
            if (mySphere[i].getVolume() >= 765) {   // 부피가 765보다 크다면
                count++;    // count 를 +1
            }
        }
        System.out.println("구의 부피가 765cm^3 이상인 큰 구는 " + count + "개입니다.");
        // 765cm^3 보다 큰 부피를 가진 구의 개수 출력
        System.out.println("구의 부피가 765cm^3 미만인 작 구는 " + (5 - count) + "개입니다.");
        // 765cm^3 보다 작은 부피를 가진 구의 개수 출력
    }
}
