package phidget;

import com.phidget22.*;

public class redLEDBlink3
{

	public static void main(String[] args) throws Exception
	{
		DigitalOutput redLED = new DigitalOutput();
		
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		
		redLED.open(1000);
		
		redLED.setState(true);
		Thread.sleep(1000);
		redLED.setState(false);
		Thread.sleep(1000);
		redLED.setState(true);
		Thread.sleep(1000);
		redLED.setState(false);
		Thread.sleep(1000);
		redLED.setState(true);
		Thread.sleep(1000);
		redLED.setState(false);
		Thread.sleep(1000);
	}

}
