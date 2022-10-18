package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Triple'A'");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Garment");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Carlee");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bala");
		driver.findElement(By.name("createLeadForm_departmentName")).sendKeys("Women's Fashion wear");
		driver.findElement(By.name("createLeadForm_description")).sendKeys("Exclusive Showroom for Womens");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("carleecreations2019@gmail.com");
		driver.findElement(By.id("Create Lead")).click();
		driver.findElement(By.id("subMenuButton")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Keep Shopping");
		driver.findElement(By.id("Update")).click();
		String title=driver.getTitle();
		System.out.println(title);

}
}
	