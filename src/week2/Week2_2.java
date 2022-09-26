package week2;

import java.util.Scanner;   //Scanner class import

public class Week2_2 {
    public static void main(String[] args) {
        Scanner oInDev = new Scanner(System.in);    // 객체를 생성하고, 입력한 값을 byte 단위로 받아들임
        int[] iArr = new int[10];   // int 형 배열 선언, size 는 문제에서 주어진 대로 10

        System.out.print("정수 10개를 입력하시오 : ");   // 입력 안내문 출력
        for (int i = 0; i < iArr.length; i++) { // 반복문을 이용하여 모든 원소를 입력받아서
            iArr[i] = oInDev.nextInt(); // 배열에 차례대로 저장
        }

        System.out.print("입력한 정수 : ");  // 출력 안내문
        for (int i = 0; i < iArr.length; i++) { // 배열에 저장한 원소를 반복문을 이용하여
            System.out.print(iArr[i] + " ");    // 차례대로 출력
        }
        System.out.println();   // 가독성을 위한 개행

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

        System.out.print("오름차순 정렬한 결과 : "); // 출력 안내문
        for (int i = 0; i < iArr.length; i++) { // 반복문 이용하여 배열의 모든 원소 출력
            System.out.print(iArr[i] + " ");
        }
        System.out.println();   // 가독성을 위한 개행


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

        System.out.print("내림차순 정렬한 결과 : "); // 출력 안내문
        for (int i = 0; i < iArr.length; i++) { // 반복문 이용하여 배열의 모든 원소 출력
            System.out.print(iArr[i] + " ");
        }

        oInDev.close(); // Scanner 사용 종료
    }
}
