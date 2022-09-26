//9월 8일 이론수업
package lecture;

import java.util.Scanner;

public class Hi {
    public static void main(String[] args) {
        int iScore;
        int iYear;

        boolean bFlag;
        Scanner oInDev;

        oInDev = new Scanner(System.in);
        System.out.print("점수와 학년을 입력하시오 : ");
        iScore = oInDev.nextInt();
        iYear = oInDev.nextInt();

        if (iScore >= 60) {
            if (iYear == 4) {
                if (iScore >= 70) {
                    bFlag = true;
                } else {
                    bFlag = false;
                }

            } else {
                bFlag = true;
            }
        } else {
            bFlag = false;
        }

        if (bFlag == true) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        oInDev.close();
    }
}
