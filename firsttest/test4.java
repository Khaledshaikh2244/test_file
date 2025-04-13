package firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       
       try {
    	   driver.get("");
    	   driver.manage().window().maximize();
    	   
    	   WebElement emailField = driver.findElement(By.id("email"));
    	   emailField.sendKeys("");
    	   
    	   WebElement passwordField = driver.findElement(By.id("password"));
    	   passwordField.sendKeys("");
    	   passwordField.sendKeys(Keys.ENTER);
    	   
           Thread.sleep(3000);
           
           
           WebElement hospitalTab = driver.findElement(By.xpath("//a[contains(@class, 'nav-item nav-link') and contains(text(), 'Hospital')]"));
           hospitalTab.click();
       
           Thread.sleep(2000);
           
           WebElement usersDetailsTab = driver.findElement(By.xpath("//a[contains(@class, 'nav-item nav-link') and contains(text(), 'Users Details')]"));
           usersDetailsTab.click();
           
           Thread.sleep(2000);
           
           WebElement PatientsDetailsTab = driver.findElement(By.xpath("//a[contains(@class, 'nav-item nav-link') and contains(text(), 'Patients Details')]"));
           PatientsDetailsTab.click();
           
           Thread.sleep(2000);
           
           WebElement PrescribedMedicineTab = driver.findElement(By.xpath("//a[contains(@class, 'nav-item nav-link') and contains(text(), 'Prescribed Medicine')]"));
           PrescribedMedicineTab.click();
           
           Thread.sleep(2000);
           
           WebElement LogoutButton = driver.findElement(By.xpath("//button[contains(@class, 'logout-btn btn btn-danger') and contains(text(), 'Logout')]"));
           LogoutButton.click();
           
           
           
       } catch (Exception e) {
           e.printStackTrace();       }
           

	}

}



// 1st testing Done
