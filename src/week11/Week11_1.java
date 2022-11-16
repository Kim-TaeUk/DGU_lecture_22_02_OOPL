package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Week11_1 {
    public static void main(String[] args) {
        ArrayList<String> arrListA = new ArrayList<>(Arrays.asList("AAA", "BBB", "CCC", "DDD", "EEE"));    // arrListA의 값을 초기화
        ArrayList<String> arrListB = new ArrayList<>(Arrays.asList("AAA", "BBB", "CCC", "BBB", "EEE"));    // arrListB의 값을 초기화
        ArrayList<String> resArrList = new ArrayList<>();  // 같은지 다른지 Yes, No를 저장할 resArrList

        for (int i = 0; i < arrListA.size(); i++) {    // list의 size만큼 반복
            if (Objects.equals(arrListA.get(i), arrListB.get(i))) {     // arrListA와 arrListB의 item을 null-safe 하게 비교한다
                resArrList.add("Yes"); // 같다면 Yes를
            } else {
                resArrList.add("No");  // 다르다면 No를 resArrList에 add
            }
        }

        System.out.println("첫번째 배열의 값 : " + arrListA);  // arrListA 출력
        System.out.println("두번째 배열의 값 : " + arrListB);  // arrListB 출력
        System.out.println(resArrList);  // resArrList 출력
    }
}
