package lecture;

public class Lecture1117_2 {
    public static void main(String[] args) {
        CmyGenStack<String> oStringStack;

        oStringStack = new CmyGenStack<>();
        oStringStack.push("DongGuk");
        System.out.println(oStringStack.getSize());
        oStringStack.push("Computer");
        System.out.println(oStringStack.getSize());
        System.out.println(oStringStack.isFull());
        System.out.println("pop한 data: " + oStringStack.pop());
        System.out.println("pop한 data : " + oStringStack.pop());
        System.out.println(oStringStack.isEmpty());
    }
}
