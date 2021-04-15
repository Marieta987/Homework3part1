import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class FinalProject {
    public static void main(String args[]){
        WebDriver wd = new OperaDriver();
        wd.get("https://github.com/operasoftware/operachromiumdriver/releases");

    }

    public static void WebDriverFindElements(){
        WebDriver  driver = new OperaDriver();
        driver.get("https://www.nyxcosmetics.com");
        WebElement bag = ((OperaDriver) driver).findElementByClassName("l-header__top-nav-row");
        bag.click();
        WebElement esim = ((OperaDriver) driver).findElementById("site-content");
        esim.click();
        esim.getText();

        WebElement search = (((OperaDriver) driver).findElementByClassName("l-header__search-button");
        search.clear();

    }

    public static void WebDriverFindSignUp(){
        WebDriver  driver = new OperaDriver();
        driver.navigate().to( "https://www.nyxcosmetics.com/cart" );
        WebElement email = driver.findElement(By.className("c-text-field__input"));
        email.click();
        email.sendKeys("testEmail@test.test");
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();


    }




}
