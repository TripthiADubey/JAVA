package shape;

class Circle {
	protected double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double calcArea() 
	{
		return 3.142 * this.radius*this.radius;
	}
	
	
}
