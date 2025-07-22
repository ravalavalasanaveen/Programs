package Day3;

class Shape {
	void draw()
	{
		System.out.println("Draw a Shape");
	}
}

class Circle extends Shape{
	@Override 
	void draw()
	{
		System.out.println("Draw a Circle");
	}
}

class Rectangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Draw a Rectangle");
	}
}

public class PolymorphismEx {

	public static void main(String[] args) {
	
		Shape s1 = new Circle();
		Shape s2 = new Rectangle(); 
	//	Shape s3 = new Shape();
		
		s1.draw();
		s2.draw();
		// s3.draw();

	}

}
