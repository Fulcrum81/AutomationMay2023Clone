package shapes;

public class Circle extends Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.pow(radius, 2) * Math.PI;
        this.shapeName = "Circle";
    }

    @Override
    public double getArea() {
        return area;
    }

    public double getRadius() {
        return radius;
    }
}
