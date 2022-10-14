package lecture;

public class Lecture1013 {
    public static void main(String[] args) {
        Point oMyPoint;
        oMyPoint = new Point();
        oMyPoint.set(1, 2);
        oMyPoint.showPoint();

        ColorPoint oMyColorPoint;
        oMyColorPoint = new ColorPoint();
        oMyColorPoint.set(3, 4);
        oMyColorPoint.setColor("red");
        oMyColorPoint.showColorPoint();
    }
}

