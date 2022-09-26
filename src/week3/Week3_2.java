package week3;

import java.util.Scanner;   //Scanner class import

public class Week3_2 {
    public static void main(String[] args) {
        Scanner oInDev = new Scanner(System.in);    // 객체를 생성하고, 입력한 값을 byte 단위로 받아들임
        int[][] iArr;   // 2차원 배열 iArr 선언
        int row, col;   // 행 개수와 열 개수를 입력 받을 row col 선언

        System.out.print("2차원 배열의 행을 입력하시오 : ");    // 입력 안내문 츨력
        row = oInDev.nextInt();     // 행의 개수 row 입력 받음
        System.out.print("2차원 배열의 열을 입력하시오 : ");    // 입력 안내문 출력
        col = oInDev.nextInt();     // 열의 개수 col 입력 받음
        iArr = new int[row][col];   // row * col 의 2차원 배열을 만듬
        System.out.println(row + " * " + col + "의 배열이 만들어졌습니다.");   // 배열의 정보 출력

        for (int i = 0; i < row; i++) {     // 행 단위로 입력 받으니까 열 개수만큼 반복
            System.out.print(i + 1 + "행의 원소 " + col + "개를 입력하시오 : ");   // 입력 안내문 출력
            for (int j = 0; j < col; j++) {
                iArr[i][j] = oInDev.nextInt();  // 입력 받은 값 배열에 저장
            }
        }

        System.out.println("배열의 원소 총 개수 : " + row * col);   // 배열의 총 원소 출력
        // 정방형 배열이기 때문에 원소의 총 개수 = 행 개수 * 열 개수

        for (int i = 0; i < row; i++) {     // 반복문 이용하여 배열의 모든 원소 출력
            for (int j = 0; j < col; j++) { // 2차원 배열이기 때문에 이중 for 문 필요
                System.out.print(iArr[i][j] + " ");
            }
            System.out.println();   // 가독성을 위한 개행
        }

        oInDev.close(); // Scanner 사용 종료
    }
}
