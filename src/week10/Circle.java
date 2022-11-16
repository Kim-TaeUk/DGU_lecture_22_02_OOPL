package week10;

public class Circle {
    private final int x, y;
    private final int radius;

    Circle(int x, int y, int radius) {  // 매개 변수가 있는 생성자
        this.x = x; // this 를 이용하여 매개변수 x 을 멤버변수 x 에 저장
        this.y = y; // this 를 이용하여 매개변수 y 을 멤버변수 y 에 저장
        this.radius = radius; // this 를 이용하여 매개변수 radius 을 멤버변수 radius 에 저장
    }

    @Override
    public String toString() {  // method overriding
        return "Circle(" + x + ", " + y + ")의 반지름은 " + radius + "입니다.";
        // 출력문에 맞게 메소드를 재정의
    }

    @Override
    public boolean equals(Object obj) { // method overriding, boolean로 return
        Circle tempCircle = (Circle) obj;   // down-casting
        return x == tempCircle.x && y == tempCircle.y;  // 중심의 좌표가 같으면 true return
    }
}
