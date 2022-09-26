package week1;

import java.util.Scanner;   //Scanner class import

public class Week1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //객체를 생성하고, 입력한 값을 byte 단위로 받아들임

        int num = 0;    //입력받을 n을 저장할 int 형 변수 num 선언 및 0으로 초기화
        System.out.print("정수 n을 입력하시오 : "); //입력 안내문 출력
        num = sc.nextInt();   //Scanner class 의 method nextLine()를 이용하여 변수 num 에 저장

        System.out.println("피보나치 수열의 제일 마지막 값은 " + fibonacci(num) + " 입니다"); //출력문

        sc.close(); //Scanner 사용 종료
    }

    public static int fibonacci(int n) {    //피보나치 수열의 n 번째 값을 구하는 함수
        if (n <= 1) {   //n이 1 일 때
            return n;   //n을 return
        } else {    //n이 2 이상일 경우는 피보나치 수열에 맞게 n-2번째와 n-1번째를 더하여 return
            return fibonacci(n - 2) + fibonacci(n - 1); //recursive 하게 구현
        }
    }
}
