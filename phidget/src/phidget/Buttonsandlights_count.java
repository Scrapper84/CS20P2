package phidget;

import com.phidget22.*;

public class Buttonsandlights_count
{

	public static void main(String[] args) throws Exception
	{
		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput greenLED = new DigitalOutput();
		
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		
		redButton.open(1000);
		greenButton.open(1000);
		
		boolean buttonState = false;
		int timespressed = 0;
		
		while (true)
		{
			if (redButton.getState() && !buttonState)
			{
				redLED.setState(true);
				timespressed ++;
				System.out.print(buttonState);
			}
			else if (!redButton.getState() && buttonState)
			{
				redLED.setState(false);
			}
		
			if (greenButton.getState() && !buttonState)
			{
				greenLED.setState(true);
				timespressed ++;
				System.out.print(buttonState);
			}
			else if (!greenButton.getState() && buttonState)
			{
				greenLED.setState(false);
			}
		}
	}
}
