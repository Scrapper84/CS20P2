package circle;

public class circle_t
{

	public static void main(String[] args)
	{
		Circle spot = new Circle();
		
		spot.setRadius(5);
		
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Cricle area: " + spot.area());
	}

}
