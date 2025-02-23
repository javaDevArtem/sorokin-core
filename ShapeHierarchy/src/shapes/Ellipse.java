package shapes;

public class Ellipse extends Shape {
    protected double semiMajorAxis;
    protected double semiMinorAxis;

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        if (semiMajorAxis <= 0 || semiMinorAxis <= 0) {
            throw new IllegalArgumentException("Axes must be positive");
        }
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis)));
    }
}
