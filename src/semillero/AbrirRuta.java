package semillero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbrirRuta {
	
	public void abrir(WebDriver casemiro) {		
	//casemiro.get("http://newtours.demoaut.com/");
	casemiro.get("https://www.youtube.com/");
	casemiro.findElement(By.name("search")).sendKeys("BouncyBob");
	//casemiro.findElement(By.name("userName")).sendKeys("sophos");
	//casemiro.findElement(By.name("password")).sendKeys("123");
	}

	
}
