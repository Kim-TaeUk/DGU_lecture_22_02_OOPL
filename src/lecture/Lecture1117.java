package lecture;

public class Lecture1117 {
    public static void main(String[] args) {
        CmyIntStack oIntStack;

        oIntStack = new CmyIntStack();
        oIntStack.push(5);
        System.out.println(oIntStack.getSize());
        oIntStack.push(3);
        System.out.println(oIntStack.getSize());
        System.out.println(oIntStack.isFull());
        System.out.println("pop한 data: " + oIntStack.pop());
        System.out.println("pop한 data : " + oIntStack.pop());
        System.out.println(oIntStack.isEmpty());
    }
}
