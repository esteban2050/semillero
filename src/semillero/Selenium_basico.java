package semillero;

public class Selenium_basico {

	public static void main(String[] args) {			
		/*Utilidades robotff = new Utilidades();
		robotff.tomarScreenShot(
		"C:\\imagenes\\imagenesfirefox",
		"webdriver.gecko.driver",
		"C:\\Driver\\geckodriver.exe",
		2);*/
	
		/*Utilidades robotie = new Utilidades();
		robotie.tomarScreenShot(
				"C:\\imagenes\\imagenesIE",
				"webdriver.ie.driver",
				"C:\\Driver\\IEDriverServer.exe",
				1);*/
				
		Utilidades robotchrome = new Utilidades();
		robotchrome.tomarScreenShot(
		"C:\\imagenes\\imagenesChrome",
		"webdriver.chrome.driver",
		"C:\\Driver\\chromedriver.exe",
		3);
	}
}
