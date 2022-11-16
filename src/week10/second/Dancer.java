package week10.second;  // second package 로 분리

import week10.first.Person; // Person package 의 name 을 사용하기 때문에 first package 를 import 해준다

public class Dancer extends Person {
    public void dance() {
        System.out.println(name + " : 댄스 시작!");
    }
}
