package week4;

import java.util.Scanner;

public class Week4_2 {
    static class ChickenSeller {
        // field
        private int chickenNumber;  // 총 치킨의 개수인 field chickenNumber
        private int chickenPrice;   // 치킨의 판매 가격인 field chickenPrice
        private int soldChickenNumber;  // 판매한 치킨의 개수인 field soldChickenNumber
        private int customerBalance = 300000;  // 고객의 잔고인 field customerBalance


        // method
        ChickenSeller() {   // 기본 생성자 ChickenSeller
            chickenNumber = 60;     // 총 치킨의 개수 60으로,
            chickenPrice = 10000;   // 치킨의 가격 10000으로 초기화
        }

        void sellChicken() {   // 치킨이 팔렸을 때 정보를 update 해주는 멤버함수
            soldChickenNumber++;    // 치킨이 팔리면 팔린 치킨의 개수는 +1
            chickenNumber--;    // 총 치킨의 개수는 -1
        }

        void showStatus() {     // 판매자와 구매자의 현황을 나타내는 멤버함수 showStatus
            System.out.println("치킨 판매자 현황");    // 출력 안내문
            System.out.println("남은 치킨 : " + chickenNumber); // 남은 치킨 개수 출력
            System.out.println("판매 수익 : " + soldChickenNumber * chickenPrice);   // 판매 수익 출력 = 팔린 치킨 개수 * 치킨 가격
            System.out.println();

            System.out.println("치킨 구매자 현황");    // 출력 안내문
            System.out.println("현재 잔액 : " + (customerBalance - soldChickenNumber * chickenPrice));  // 원래 잔고 - (팔린 치킨 개수 * 치킨 가격)
            System.out.println("치킨 개수 : " + soldChickenNumber); // 팔린 치킨 개수
        }
    }

    public static void main(String[] args) {
        Scanner oInDev = new Scanner(System.in);    //객체를 생성하고, 입력한 값을 byte 단위로 받아들임
        ChickenSeller oChicken = new ChickenSeller();   // ChickenSeller 클래스의 객체 oChicken 생성

        int flag;   // 입력 받을 정수 flag

        while (true) {
            System.out.print("치킨을 구매하려면 0, 프로그램을 종료하려면 1을 입력하시오 : ");   // 입력 안내문
            flag = oInDev.nextInt();
            if (flag == 0) {   // 조건에 맞는 flag를 입력했을 때 -> 치킨 구매 시
                oChicken.sellChicken();     // 치킨 한마리 구매하고
                oChicken.showStatus();      // 현황 보여주기
                System.out.println();       // 가독성을 위한 개행
            } else if (flag == 1) {   // 조건에 맞는 flag를 입력했을 때 -> 프로그램 종료 시
                System.out.println("프로그램이 종료됩니다!");     // 종료 안내문 출력
                break;      // while문 탈출하고 프로그램 종료
            } else {        // 조건에 맞지 않은 flag 입력했을 때
                System.out.println("ERROR! 0또는 1을 입력하시오!");     // error문 출력
            }
        }
    }
}
