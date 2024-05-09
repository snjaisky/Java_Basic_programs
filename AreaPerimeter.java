package Programs;

public class AreaPerimeter {
	
	public static void main(String[] args) {
        double length = 5, width = 3;
        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        double radius = 3;
        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);
    }

}
