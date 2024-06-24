import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemoTest {
    @Test
    public void LocatorSearch() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        browser.findElement(By.id("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        browser.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        browser.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
        browser.findElement(By.className("inventory_item_desc"));
        browser.findElement(By.tagName("div"));
        browser.findElement(By.partialLinkText("Backpack"));
        //xpath
        browser.findElement(By.xpath("//a[@data-test='inventory-sidebar-link']"));
        browser.findElement(By.xpath("//button[text()='Add to cart']"));
        browser.findElement(By.xpath("//button[contains(@id, 'add-to-cart')]"));
        browser.findElement(By.xpath("//button[contains(text(),'cart')]"));
        browser.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::div[@data-test='inventory-item-description']"));
        browser.findElement(By.xpath("//div[@class='inventory_list']//descendant::div[contains(text(),'Sauce Labs Backpack')]"));
        browser.findElement(By.xpath("//button[contains(text(),'Add to cart')]/following::div[@class='inventory_item_price']"));
        browser.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Backpack')]/.."));
        browser.findElement(By.xpath("//button[contains(text(),'Add to cart')]/preceding::div[@class='inventory_item_price']"));
        browser.findElement(By.xpath("//a[@class='bm-item menu-item' and @style='display: block;']"));
        //Css
        browser.findElement(By.cssSelector(".header_label"));
        browser.findElement(By.cssSelector(".btn.btn_primary"));
        browser.findElement(By.cssSelector(".pricebar .inventory_item_price"));
        browser.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt"));
        browser.findElement(By.cssSelector("button"));
        browser.findElement(By.cssSelector("button.btn_primary"));
        browser.findElement(By.cssSelector("button[data-test='add-to-cart-sauce-labs-backpack']"));

        browser.quit();


    }
}
