package phidget;

import com.phidget22.*;

public class Readbuttonmodified_Green
{

	public static void main(String[] args) throws Exception
	{
		DigitalInput greenButton = new DigitalInput();
		
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		
		greenButton.open(1000);
		
		boolean buttonState = false;

		
		while(true)
		{
			if(greenButton.getState() && !buttonState) 
			{
				System.out.println("button state is true");
			}
			else if(!greenButton.getState() && buttonState)
			{
				System.out.println("button state is false");
			}
		buttonState = greenButton.getState();
		Thread.sleep(150);
		}
	}
}
