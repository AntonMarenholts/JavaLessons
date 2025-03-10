package lesson29.hw29.shape;

public class ShapeApp {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(6),
                new Rectangle(12,33),
                new Triangle(31,42,59),
                new Triangle(1, 2, 10)
        };

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes){
            totalArea += shape.getArrea();
            totalPerimeter += shape.getPerimeter();
        }

        System.out.printf("Общая площадь: %.2f \n", totalArea);
        System.out.printf("Общий периметр: %.2f \n", totalPerimeter);






    }

}
