package week10.third;   // third package 로 분리

import week10.second.Dancer;

public class DancerExam {
    public static void main(String[] args) {
        Dancer dancer1 = new Dancer();

        dancer1.name = "짱구";
        dancer1.speak();
        dancer1.dance();
    }
}
