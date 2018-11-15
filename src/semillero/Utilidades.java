package semillero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utilidades 
{
	public void tomarScreenShot(String rutaFoto, String driver, String rutaDriver,int opc) 
	{		 
		System.setProperty(driver, rutaDriver);
		objetoCasemiro traiga = new objetoCasemiro();
		WebDriver casemiro = traiga.CaseMiro(opc);
		AbrirRuta ruta= new AbrirRuta();
		ruta.abrir(casemiro);				
		Tomar_Foto.tomarScreenShoot(casemiro, "prueba",rutaFoto);
		casemiro.findElement(By.name("login")).click();
		Tomar_Foto.tomarScreenShoot(casemiro, "prueba",rutaFoto);
		casemiro.close();
	}
}
