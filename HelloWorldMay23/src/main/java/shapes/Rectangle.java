package shapes;

public class Rectangle extends Shape {
    private double sideALength;
    private double sideBLength;

    private double area;

    public Rectangle(double sideALength, double sideBLength) {
        this.sideALength = sideALength;
        this.sideBLength = sideBLength;

        this.area = sideALength * sideBLength;
        this.shapeName = "Rectangle";
    }

    @Override
    public double getArea() {
        return area;
    }
}
