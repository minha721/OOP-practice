public class TestClass2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObjectComparable[] objects = {new Square(2), new Circle(5), 
			new Square(5), new Rectangle(3, 4), new Square(4.5)};
		for(int i=0; i<=4; i++) {
			System.out.println("Area is " + objects[i].getArea());
			if(objects[i] instanceof Colorable) {
				objects[i].howToColor();	
			}
		}
	}
}
