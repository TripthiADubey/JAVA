package shape;

public class Square {
	int side;
	public Square(int side)
	{
		this.side=side;
	}
	public void calcArea() 
	{
		int area =  this.side*this.side;
		System.out.println("Atra of square is" + area);
	}
	
	
}
