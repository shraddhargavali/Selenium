package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ecart {

	public static void main(String[] args) {
		//commit
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");

		WebElement txtFirstName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		txtFirstName.clear();
		txtFirstName.sendKeys("iranna");

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("pujari");

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("iranna@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9999999999");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();

		List<WebElement> ele = driver.findElements(By.xpath("//*[@type='checkbox']"));

		for (WebElement el : ele) {
			if (el.getDomAttribute("value").equals("Hockey") || el.getDomAttribute("value").equals("Cricket")) {
				el.click();
			}
			// el.click();
		}

		driver.findElement(By.id("msdd")).click();

		List<WebElement> ele2 = driver
				.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul//li/a"));

		for (WebElement webElement : ele2) {
			// System.out.println(webElement.getText());

			if (webElement.getText().equals("Hindi") || webElement.getText().equals("Finnish")
					|| webElement.getText().equals("English")) {
				webElement.click();
			}
		}

		WebElement ele3 = driver.findElement(By.id("Skills"));

		Select sc = new Select(ele3);
		//sc.selectByIndex(2);
		sc.selectByVisibleText("Android");
		
//		
//		WebElement ele4=driver.findElement(By.id("country"));
//		ele4.click();
//		
//		Select sc1 = new Select(ele4);
//		sc1.selectByIndex(5);
		
		
		List<WebElement> ele4=driver.findElements(By.xpath("//*[@id=\"country\"]/option"));
		
		for (WebElement webElement1 : ele4) {
			//System.out.println(webElement1.getText());
			
			if(webElement1.getText().equals("India"))
			{
				webElement1.click();
			}
		}
		
		WebElement ele5=driver.findElement(By.id("yearbox"));
		
		Select sc2 = new Select(ele5);
		sc2.selectByIndex(5);
		
		
		WebElement ele6=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		
		Select sc3 = new Select(ele6);
		sc3.selectByIndex(5);
		
		
		
		WebElement ele7=driver.findElement(By.id("daybox"));
		
		Select sc4 = new Select(ele7);
		sc4.selectByIndex(5);
	}

}
