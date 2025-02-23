import shapes.*;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[60];
        int index = 0;

        for (int i = 0; i < 10; i++) {
            shapes[index++] = new Circle(5);
            shapes[index++] = new Ellipse(5, 3);
            shapes[index++] = new Rectangle(4, 6);
            shapes[index++] = new Square(4);
            shapes[index++] = new Triangle(3, 4, 5);
            shapes[index++] = new RegularTriangle(4);
        }

        double totalArea = 0;
        double totalPerimeter = 0;
        double triangleArea = 0;
        double trianglePerimeter = 0;
        double rectangleArea = 0;
        double rectanglePerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
            totalPerimeter += shape.getPerimeter();
            if (shape instanceof Triangle) {
                triangleArea += shape.getArea();
                trianglePerimeter += shape.getPerimeter();
            } else if (shape instanceof Rectangle) {
                rectangleArea += shape.getArea();
                rectanglePerimeter += shape.getPerimeter();
            }
        }

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
        System.out.println("Total Triangle Area: " + triangleArea);
        System.out.println("Total Triangle Perimeter: " + trianglePerimeter);
        System.out.println("Total Rectangle Area: " + rectangleArea);
        System.out.println("Total Rectangle Perimeter: " + rectanglePerimeter);
    }
}