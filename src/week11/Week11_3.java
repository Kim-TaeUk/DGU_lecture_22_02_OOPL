package week11;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Week11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 객체를 생성하고, 입력한 값을 byte 단위로 받아들임
        HashMap<String, Integer> nations = new HashMap<>(); // hashmap 생성

        System.out.println("국가 이름과 인구를 입력하시오.(예 : 한국 5162)");   // 출력문 출력

        while (true) {  // 반복문 이용하여
            String nation;  // 국가 이름 입력 받을 변수
            int popularity; // 인구 입력 받을 변수

            System.out.print("국가 이름, 인구 : ");   // 출력문 출력
            nation = sc.next();  // 입력 받은 국가 저장
            if (Objects.equals(nation, "종료")) { // 종료 조건 나오면
                break;  // while문 탈출
            }
            popularity = sc.nextInt();  // 입력 받은 인구 저장

            nations.put(nation, popularity);    // hashmap nations에 key-value 값 추가
        }

        while (true) {  // 반복문 이용하여
            String tempNation;

            System.out.print("국가 이름 : ");   // 출력문 출력

            tempNation = sc.next();
            if (Objects.equals(tempNation, "종료")) { // 종료 조건 나오면
                break;  // while문 탈출
            }
            System.out.println(tempNation + "의 인구는 " + nations.get(tempNation) + "만명입니다.");
        }

        sc.close(); // Scanner 사용 종료
    }
}
