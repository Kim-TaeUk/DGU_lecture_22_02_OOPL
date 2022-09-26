package lecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture922_2 {
    public static void setIntArray(int[] iArr) {
        Scanner onInDev;

        onInDev = new Scanner(System.in);

        for (int i = 0; i < iArr.length; i++) {    // 여기서 ArrayIndexOutOfBoundsException 발생
            try {
                System.out.print("배열의 " + (i + 1) + "번쨰 원소를 입력하시오 : ");
                iArr[i] = onInDev.nextInt();
            } catch (InputMismatchException eInMis) {
                String sTmp = onInDev.next();
                System.out.println("ERROR!" + sTmp + "를 입력했습니다. 정수만 입력하시오!");
                i = i - 1;
            } catch (ArrayIndexOutOfBoundsException eArith) {
                System.out.println("ERROR! 배열의 크기를 벗어났다.");
            }
        }

        onInDev.close();
    }

    public static void getIntArray(int[] iArr) {
        System.out.print("배열의 원소 출력 결과 : ");
        for (int i = 0; i < iArr.length; i++) {
            System.out.print(iArr[i] + " ");
        }
        System.out.println();
    }

    public static double getAvgArray(int[] arr) {
        int iSum = 0;
        double dAvg = 0.0;

        for (int i = 0; i < arr.length; i++) {
            iSum = iSum + arr[i];
        }

        dAvg = (double) iSum / (double) arr.length;

        return dAvg;
    }

    public static void main(String[] args) {
        int iArr[];
        final int ARRAYSIZE = 3;
        double dMyAvg;

        iArr = new int[ARRAYSIZE];

        setIntArray(iArr);

        getIntArray(iArr);

        dMyAvg = getAvgArray(iArr);
        System.out.println("배열 원소의 평균 : " + dMyAvg);
    }
}
