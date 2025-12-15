package circle;

public class Circle
{
		private static final double PI = 3.14;
		private double radius;

		public Circle()
		{
			radius = 1;
		}
	
		public void setRadius(double newRadius)
		{
			radius = newRadius;
		}
	
		public double area()
		{
			double CircleArea;
		
			CircleArea = PI * radius * radius;
			return(CircleArea);
		}
	
		public double getRadius()
		{
			return(radius);
		}
	
}
