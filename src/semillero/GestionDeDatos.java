package semillero;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GestionDeDatos {
	
	public static WebDriver casemiro;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		casemiro = new ChromeDriver();
		casemiro.manage().window().maximize();
		casemiro.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		casemiro.get("http://newtours.demoaut.com/");
		casemiro.findElement(By.name("userName")).click();

		try {
			FileInputStream fis = new FileInputStream("C:\\datos\\datos.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheet = wb.getSheet("login");
			for (int count = 1; count <= sheet.getLastRowNum(); count++) {
				HSSFRow row = sheet.getRow(count);
				System.out.println("\n----------------------------");
				System.out.println("Corriendo el test " + count);
				runTest(row.getCell(0).toString(), row.getCell(1).toString());
			}
			fis.close();
			casemiro.close();
		} catch (IOException e) {
			System.out.println("no se encontro el archivo");
		}
	}

	public static void runTest(String userName, String password) throws InterruptedException {
		System.out.println("Ingresando usuario: " + userName + " y password: " + password);

		casemiro.findElement(By.name("userName")).clear();
		casemiro.findElement(By.name("password")).clear();

		casemiro.findElement(By.name("userName")).sendKeys(userName);
		casemiro.findElement(By.name("password")).sendKeys(password);
		casemiro.findElement(By.name("login")).click();

		System.out.println("ingresado usuario: " + userName + " y password: " + password);

		Thread.sleep(2000); // Sleeping 2 seconds so that each entry is detected.

	}
}
