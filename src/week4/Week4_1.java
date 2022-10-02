package week4;

import java.util.InputMismatchException;
import java.util.Scanner;   //Scanner class import

public class Week4_1 {
    public static void main(String[] args) {
        Scanner onInDev = new Scanner(System.in);    // 객체를 생성하고, 입력한 값을 byte 단위로 받아들임
        double dResult = 0.0;
        int iInput = 0;

        while (true) {  // q가 입력되기 전까지 반복해야하므로 무한 loop로
            System.out.print("숫자를 입력하시오(q 입력 시 종료) : ");    // 입력 안내문 출력
            try {   // try - catch로 exception 잡기
                iInput = onInDev.nextInt(); // 정수일 경우 nextInt로 받아서 iInput에 저장
                dResult = 54 + iInput;  // 조건에 맞게 입력한 정수에 54를 더하여 출력
                System.out.println(iInput + " + 54의 결과는 " + dResult + "입니다.");  // 결과 출력
            } catch (InputMismatchException eInMis) {   // try - catch에서 exception 잡았을 때 -> 문자 입력일 때
                String sTmp = onInDev.next();   // sTmp에 입력받은 문자 저장하고
                if (sTmp.equals("q")) { // 종료조건인 q인지 확인
                    // error log 찍고 싶으면 아래 주석해제하면 됨
//                    eInMis.printStackTrace();
//                    System.out.println(eInMis.getClass() + " 예외가 " + eInMis.getMessage() + " 때문에 발생했습니다.");
                    System.out.println(sTmp + "를 입력하여 프로그램을 종료합니다.");   // q를 입력했기에 종료한다는 안내문 출력
                    onInDev.nextLine();
                    break;  // 프로그램 종료해야 하니 while문 탈출
                } else {    // 문자 입력인데 q(종료조건)이 아닐 때
                    System.out.println("ERROR! " + sTmp + "를 입력했습니다. 숫자를 입력해야합니다.");
                    // q가 아닌 문자일 경우 Error문 출력
                }
            }
        }
        onInDev.close();    // Scanner 사용 종료
    }
}
