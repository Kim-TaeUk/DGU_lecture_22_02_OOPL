package week7;

class Point { // class Point 선언 및 구현
    private int x; // 멤버변수 x 선언
    private int y; // 멤버변수 y 선언

    Point(int x, int y) {   // 매개변수가 있는 생성자
        this.x = x; // this 를 이용하여 매개변수 x 을 멤버변수 x 에 저장
        this.y = y; // this 를 이용하여 매개변수 y 을 멤버변수 y 에 저장
    }

    public int getX() { // 멤버함수 getX 구현
        return x;   // x 를 리턴
    }

    public int getY() { // 멤버함수 getY 구현
        return y;   // y 를 리턴
    }

    protected void move(int x, int y) { // 멤버함수 move 구현
        this.x = x; //
        this.y = y; //
    }
}

class PositivePoint extends Point { // Point 클래스를 상속받은 PositivePoint 클래스
    PositivePoint() {   // 기본 생성자
        super(0, 0);   // 상속받은 부모의 생성자 호출
    }

    PositivePoint(int x, int y) {   // 매개변수가 있는 생성자
        super(x, y);    // 상속받은 부모의 생성자 호출
        if (x < 0 || y < 0) {   // 음수 공간으로 move 할 경우
            super.move(0, 0);   // 원점으로 move 시킴
        }
    }

    protected void move(int x, int y) { // 멤버함수 move 구현
        if (x > 0 && y > 0) {   // 양수 공간으로의 move 일 때만
            super.move(x, y);   // 상속받은 부모를 가리키는 super 참조 변수 이용하여 move 멤버함수 호출
        }
    }

    public String toString() {  // 멤버함수 toString 구현
        return "(" + getX() + ", " + getY() + ")의 점";   // 점의 위치를 String으로 표현
    }
}

public class Week7_3 {
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();  // PositivePoint 클래스의 객체 p 생성
        p.move(20, 20); // 20, 20으로 move
        System.out.println(p + "입니다.");  // toString 이용하여 위치 출력

        p.move(-10, 10);    // 객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p + "입니다.");  // toString 이용하여 위치 출력

        PositivePoint p2 = new PositivePoint(-20, -20); // -20, 20으로 move
        System.out.println(p2 + "입니다.");  // toString 이용하여 위치 출력
    }
}
