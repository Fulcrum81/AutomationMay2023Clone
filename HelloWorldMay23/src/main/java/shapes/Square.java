package shapes;

public class Square extends Shape {
    private double sideLength;
    private double area;

    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.area = Math.pow(sideLength, 2);
        this.shapeName = "Square";
    }


    @Override
    public double getArea() {
        return area;
    }
}
