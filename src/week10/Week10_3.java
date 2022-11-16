package week10;

public class Week10_3 {
    public static void main(String[] args) {
        Circle myCircleA = new Circle(2, 3, 5); // 문제에서 주어진 대로 객체 생성
        Circle myCircleB = new Circle(2, 3, 30); // 문제에서 주어진 대로 객체 생성

        System.out.println("Circle a : " + myCircleA.toString());   // 객체의 정보 출력
        System.out.println("Circle b : " + myCircleB.toString());   // 객체의 정보 출력
        System.out.println();

        if (myCircleA.equals(myCircleB)) {
            System.out.println("Circle a와 Circle b는 서로 같은 원입니다.");
        } else {
            System.out.println("Circle a와 Circle b는 서로 다른 원입니다.");
        }
    }
}
