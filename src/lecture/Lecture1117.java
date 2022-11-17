package lecture;

class CmyIntStack {
    private final int SIZE = 2;
    private int iTop;
    private int[] iDataArr;

    public CmyIntStack() {
        iTop = -1;
        iDataArr = new int[SIZE];
    }

    public boolean push(int iData) {
        boolean bFlag;

        if (iTop >= SIZE) {
            System.out.println("Stack is FULL!!");
            bFlag = false;
        } else {
            iTop = iTop + 1;
            iDataArr[iTop] = iData;
            bFlag = true;
        }
        return bFlag;
    }

    public int pop() {
        int iRes;

        if (iTop < 0) {
            System.out.println("Stack is EMPTY!!");
            return -123123;
        } else {
            iRes = iDataArr[iTop];
            iTop = iTop - 1;
        }
        return iRes;
    }

    public int getSize() {
        int size;
        size = iTop + 1;

        return size;
    }

    public boolean isEmpty() {
        boolean bFlag;

        if (iTop < 0) {
            bFlag = true;
        } else {
            bFlag = false;
        }
        return bFlag;
    }

    public boolean isFull() {
        boolean bFlag;

        if (iTop >= SIZE - 1) {
            bFlag = true;
        } else {
            bFlag = false;
        }

        return bFlag;
    }
}

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
