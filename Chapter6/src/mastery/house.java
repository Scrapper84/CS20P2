package mastery;

public class house 
{

	public static void main(String[] args) 
	{
		addroof();
		addbase();
		addwalk();
	}
	public static void addroof()
	{
		System.out.println("   /\\");
		System.out.println("  /  \\");
		System.out.println(" /    \\");
		System.out.println("/______\\");
	}
	public static void addbase()
	{
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("|__[]__|");
	}
	public static void addwalk()
	{
		System.out.println("   **");
		System.out.println("   ***********");
	}
}