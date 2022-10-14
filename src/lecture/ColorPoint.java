package lecture;

public class ColorPoint extends Point {
    private String sColor;

    public void setColor(String sColor) {
        this.sColor = sColor;
    }

    public void showColorPoint() {
        System.out.print(sColor + " ");
        showPoint();
    }
}
