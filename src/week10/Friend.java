package week10;

public class Friend {
    private final String name, university, major, address;
    private final int age;

    Friend(String name, int age, String university, String major, String address) {
        this.name = name; // this 를 이용하여 매개변수 name 을 멤버변수 name 에 저장
        this.age = age; // this 를 이용하여 매개변수 age 을 멤버변수 age 에 저장
        this.university = university; // this 를 이용하여 매개변수 university 을 멤버변수 university 에 저장
        this.major = major; // this 를 이용하여 매개변수 major 을 멤버변수 major 에 저장
        this.address = address; // this 를 이용하여 매개변수 address 을 멤버변수 address 에 저장
    }

    @Override
    public String toString() {
        return name + " " + age + " " + university + " " + major + " " + address;
        // 출력문에 맞게 메소드를 재정의
    }
}
