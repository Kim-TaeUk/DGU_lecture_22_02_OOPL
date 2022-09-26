// 사용자한테 여려개의 정수를 입력받아서 배열에 입력받고 배열의 저장된 내용을 출력
// InputMismatchException, ArrayIndexOutOfBoundsException 예제
package lecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture922 {
    public static void main(String[] args) {
        Scanner onInDev;
        final int ARRAYSIZE = 3;
        int[] iArr;
        int num;

        onInDev = new Scanner(System.in);
        iArr = new int[ARRAYSIZE];

        for (int i = 0; i <= iArr.length; i++) {    // 여기서 ArrayIndexOutOfBoundsException 발생
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

        System.out.print("배열의 원소 출력 결과 : ");
        for (int i = 0; i < iArr.length; i++) {
            System.out.print(iArr[i] + " ");
        }

        onInDev.close();
    }
}
