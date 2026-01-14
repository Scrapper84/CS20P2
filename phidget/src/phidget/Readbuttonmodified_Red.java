package phidget;

import com.phidget22.*;

public class Readbuttonmodified_Red
{

	public static void main(String[] args) throws Exception
	{
		DigitalInput redButton = new DigitalInput();
		
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		
		redButton.open(1000);
		
		boolean buttonState = false;

		
		while(true)
		{
			if(redButton.getState() && !buttonState) 
			{
				System.out.println("button state is true");
			}
			else if(!redButton.getState() && buttonState)
			{
				System.out.println("button state is false");
			}
		buttonState = redButton.getState();
		Thread.sleep(150);
		}
	}
}
