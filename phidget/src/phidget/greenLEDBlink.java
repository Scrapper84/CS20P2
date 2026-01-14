package phidget;


import com.phidget22.*;

public class greenLEDBlink
{

	public static void main(String[] args) throws Exception
	{
		DigitalOutput greenLED = new DigitalOutput();
		
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		
		greenLED.open(1000);
		
		while(true)
		{
			greenLED.setState(true);
			Thread.sleep(1000);
			greenLED.setState(false);
			Thread.sleep(1000);
		}
	}

}
