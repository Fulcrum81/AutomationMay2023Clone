package shapes;

public abstract class Shape {
    protected String shapeName;
    public abstract double getArea();

    public String getShapeName() {
        return "Shape is: " + shapeName;
    }
}
