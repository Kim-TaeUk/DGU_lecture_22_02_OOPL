package lecture;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int[] iArr; // 정수형 배열 iArr
        Scanner oInDev;
        int iMin;   // 최소값을 가진 data의 index를 저장할 저장할 변수 iMin
        int i, j;  // 반복문에서 사용할 정수형 변수 i
        int iTemp;   // 값을 swap할 때 임시값을 저장할 변수 iTemp

        iArr = new int[10];
        oInDev = new Scanner(System.in);

        System.out.print("정수 10개를 입력하시오 : ");   // 입력 안내문 출력
        for (i = 0; i < iArr.length; i++) { // 반복문 이용하여 iArr에 사용자가 값 넣기
            iArr[i] = oInDev.nextInt();
        }

        System.out.print("입력된 값 : ");
        for (i = 0; i < iArr.length; i++) { // 입력된 결과 출력
            System.out.print(iArr[i] + " ");
        }
        System.out.println();

        for (i = 0; i < iArr.length - 1; i++) { // 마지막 인덱스의 값은 저절로 정렬된다
            iMin = i;
            for (j = i + 1; j < iArr.length; j++) { // i번째까지의 값은 정렬도
                if (iArr[iMin] > iArr[j]) {
                    iMin = j;
                }
            }
            iTemp = iArr[iMin]; // 값을 swap
            iArr[iMin] = iArr[i];
            iArr[i] = iTemp;
        }

        System.out.print("정렬된 값 : ");
        for (i = 0; i < iArr.length; i++) { // 정렬된 결과 출력
            System.out.print(iArr[i] + " ");
        }
    }
}
