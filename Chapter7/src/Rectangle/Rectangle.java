package Rectangle;

public class Rectangle
{
	private  double length, width ;
	

	public Rectangle()
	{
		length = 4;
		width = 2;
	}

	public double getLength()
	{
		return length;
	}
	
	public double getwidth()
	{
		return width;
	}
	
	public double area()
	{
		double RectangleArea;
	
		RectangleArea = length * width;
		return(RectangleArea);
	}

}
