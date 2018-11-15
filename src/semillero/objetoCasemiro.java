package semillero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class objetoCasemiro {
	public WebDriver CaseMiro(int opc)
	{
		switch(opc) 
		{
		case 1:
			WebDriver casemiroie = new InternetExplorerDriver();
			return casemiroie;			
		case 2:
			WebDriver casemiroff = new FirefoxDriver();
			return casemiroff;			
		case 3:
			WebDriver casemiroch = new ChromeDriver();
			return casemiroch;
		default:
			return null;
		}
	}
}
