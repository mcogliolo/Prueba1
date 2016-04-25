package automation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {
	@Test
	public void buscarMusicTest() throws InterruptedException{
		WebDriver browser = new FirefoxDriver();
		
		browser.get("https://www.google.com.ar");
		
		WebElement caja = browser.findElement(By.id("lst-ib"));
		
		caja.sendKeys("Porto Seguro");
		
		caja.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		String resultadoAct = browser.getTitle();
		String resultadoEsp = "Porto Seguro - Buscar con Google";
		
		browser.close();
		
		Assert.assertEquals(resultadoEsp, resultadoAct);
	}
}
