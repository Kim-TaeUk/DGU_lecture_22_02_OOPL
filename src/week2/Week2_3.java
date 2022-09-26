package week2;

import java.util.Scanner;   //Scanner class import

class Sort {    // class Sort 선언 및 구현
    // field
    int[] iArr; // 멤버변수 int 형 배열 iArr 선언

    // method
    public Sort() { // 기본 생성자
        iArr = new int[10]; // int 형 배열 선언, size 는 문제에서 주어진 대로 10
    }

    public void setArray() {    // 멤버함수 setArray 구현
        Scanner oInDev = new Scanner(System.in);    // 객체를 생성하고, 입력한 값을 byte 단위로 받아들임

        for (int i = 0; i < iArr.length; i++) { // 반복문을 이용하여 모든 원소를 입력받아서
            iArr[i] = oInDev.nextInt(); // 배열에 차례대로 저장
        }

        oInDev.close(); // Scanner 사용 종료
    }

    public int[] getArray() {   // 멤버함수 getArray 구현, int 형 배열을 return
        return iArr;    // iArr return
    }

    public void sortAsc(int[] iArr) {   // 멤버함수 sortAsc 구현
        // bubble sort 로 오름차순 정렬을 구현
        for (int i = 0; i < iArr.length; i++) { // 배열을 모든 원소를 순차탐색하는데
            for (int j = 0; j < iArr.length - i - 1; j++) {
                // loop 를 한 번 돌았을 때 가장 큰 값이 마지막으로 위치하게 됨,
                // 다음 loop 부터는 마지막 원소는 고려하지 않아도 됨, 그래서 iArr.length-i 까지만 탐색해도 됨
                if (iArr[j] > iArr[j + 1]) {    // j번째 원소의 값 > j+1번째 원소의 값이면
                    int temp = iArr[j + 1]; // temp 변수 도입하여
                    iArr[j + 1] = iArr[j];  // 값을 swap 함
                    iArr[j] = temp;
                }
            }
        }
    }

    public void sortDesc(int[] iArr) {  // 멤버함수 sortDesc 구현
        // bubble sort 로 내림차순 정렬을 구현
        // logic 은 오름차순 정렬과 동일함
        for (int i = 0; i < iArr.length; i++) {
            for (int j = 0; j < iArr.length - i - 1; j++) {
                if (iArr[j] < iArr[j + 1]) {
                    int temp = iArr[j + 1];
                    iArr[j + 1] = iArr[j];
                    iArr[j] = temp;
                }
            }
        }
    }

    public void showArrayElement(int[] iArr) {  // 멤버함수 showArrayElement 구현
        for (int i = 0; i < iArr.length; i++) { // 반복문 이용하여
            System.out.print(iArr[i] + " ");    // 배열의 모든 원소 출력
        }
    }
}

public class Week2_3 {
    public static void main(String[] args) {
        Sort oArr = new Sort(); // Sort 클래스의 객체 oArr 생성

        System.out.print("정수 10개를 입력하시오 : "); // 입력 안내문
        oArr.setArray();    // 객체 oArr의 멤버함수 setArray 호출

        System.out.print("입력한 정수 : "); // 출력 안내문
        oArr.showArrayElement(oArr.getArray()); // 객체 oArr의 멤버함수 showArrayElement 호출
        System.out.println();   // 가독성을 위한 개행


        oArr.sortAsc(oArr.getArray());  // 객체 oArr의 멤버함수 sortAsc 호출
        System.out.print("오름차순 정렬한 결과 : "); // 출력 안내문
        oArr.showArrayElement(oArr.getArray()); // 객체 oArr의 멤버함수 showArrayElement 호출
        System.out.println();   // 가독성을 위한 개행

        oArr.sortDesc(oArr.getArray()); // 객체 oArr의 멤버함수 sortDesc 호출
        System.out.print("내림차순 정렬한 결과 : "); // 출력 안내문
        oArr.showArrayElement(oArr.getArray()); // 객체 oArr의 멤버함수 showArrayElement 호출
    }
}
