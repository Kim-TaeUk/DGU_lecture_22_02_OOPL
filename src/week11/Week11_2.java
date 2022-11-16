package week11;

import java.util.Arrays;
import java.util.LinkedList;

public class Week11_2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Level1", "Level2", "Level3", "Level4", "Level5", "Level6"));    // linkedList의 값을 초기화
        LinkedList<String> resLinkedList = new LinkedList<>();  // linkedList의 item을 역순으로 저장할 resLinkedList

        System.out.println("Linked list : " + linkedList);  // linkedList 출력
        for (int i = 0; i < linkedList.size(); i++) {   // 반복문을 이용하여
            resLinkedList.add(linkedList.get(linkedList.size() - i - 1));   // 역순으로 resLinkedList에 저장
        }

        for (int i = 0; i < resLinkedList.size(); i++) {    // 반복문을 이용하여
            System.out.println(resLinkedList.get(i));   // resLinkedList의 item 출력
        }
    }
}
