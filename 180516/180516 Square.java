public class Square extends GeometricObjectComparable implements Colorable {
	private double width;
	private double height;
	
	public Square() {
	}
	public Square(double width) {
		this.width = width;
		this.height = width;
	}
	public Square(double width, double height) {
		this.width=width;
		this.height=height;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	@Override
	public double getArea() {
		return width*height;
	}
	@Override
	public double getPerimeter() {
		return 2*(width+height);
	}
	@Override
	  public void howToColor() {
		System.out.println("Color all four sides");
	  }
}