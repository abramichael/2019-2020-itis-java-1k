public class Rectangle extends Figure {
	
	private double width, height;
	
	public Rectangle(double w, double h) {
		
		width = w;
		height = h;
		
	}
	
	@Override
	public double square() {
		
		return width * height;
		
	}
	
	@Override
	public double perimeter() {
		
		return 2 * (width + height);
		
	}
	
}