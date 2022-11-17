package lecture;

class CmyGenStack<T> {
    private final int SIZE = 2;
    private int iTop;
    private Object[] oDataArr;

    public CmyGenStack() {
        iTop = -1;
        oDataArr = new Object[SIZE];
    }

    public boolean push(T oData) {
        boolean bFlag;

        if (iTop >= SIZE) {
            System.out.println("Stack is FULL!!");
            bFlag = false;
        } else {
            iTop = iTop + 1;
            oDataArr[iTop] = oData;
            bFlag = true;
        }
        return bFlag;
    }

    public T pop() {
        T oRes;

        if (iTop < 0) {
            System.out.println("Stack is EMPTY!!");
            return null;
        } else {
            oRes = (T) oDataArr[iTop];
            iTop = iTop - 1;
        }
        return oRes;
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
