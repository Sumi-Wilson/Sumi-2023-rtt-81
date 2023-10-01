package inheritance;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setName("Rectangle");
		rect.setHeight(10);
		rect.setWidth(5);

		Circle circle = new Circle();
		circle.setName("Circle");
		circle.setDiameter(100);

		Triangle triangle = new Triangle();
		triangle.setName("Triangle");
		triangle.setBase(5);
		triangle.setSide(3);
		

		List<Shape> shapes = new ArrayList<>();
		shapes.add(rect);
		shapes.add(circle);
		shapes.add(triangle);

		for (Shape shape : shapes) {
			if (shape instanceof Circle) {
				Circle c = (Circle) shape;
				c.getRadius();
			}
			System.out.println("The area for shape " + shape.getName() + " : " + shape.calculateArea());
			System.out.println("The perimeter for shape " + shape.getName() + " : " + shape.calculatePerimeter());

		}

	}

}

	