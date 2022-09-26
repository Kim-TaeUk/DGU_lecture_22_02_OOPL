//9월 15일 이론수업
package lecture;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner onInDev;

        int iNumber;
        int iLoop;
        int iRes;

        while (true) {
            System.out.print("출력하고 싶은 구구단의 숫자를 입력하시오(1~9)(0:프로그램 종료) : ");
            onInDev = new Scanner(System.in);
            iNumber = onInDev.nextInt();

            if (iNumber == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            if (iNumber > 9 || iNumber < 0) {
                System.out.println("오류입니다, 1에서 9사이의 숫자를 입력하시오");
                continue;
            }

            for (int i = 0; i < 9; i++) {
                iLoop = i + 1;
                iRes = iNumber * iLoop;
                System.out.println(iNumber + " * " + iLoop + " = " + iRes);
            }
        }

        onInDev.close();
    }
}

// 정수값 0 - 9입력 그보다 작으면 오류
// 1이면 1단 2면 2단
// 사용자가 0 입력할때까지 반복