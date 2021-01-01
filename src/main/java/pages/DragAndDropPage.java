/**
 * Created by youvegotnigel on 2021/01/01
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropPage {

    private WebDriver driver;
    private By pageName = By.linkText("Demo Site");

    //From Options
    private By boxDebitAccount = By.xpath("//*[@id='credit2']/a"); //BANK
    private By boxDebitAmount = By.xpath("//*[@id='fourth']/a");  //5000
    private By boxCreditAccount = By.xpath("//*[@id='credit1']/a"); //SALES
    private By boxCreditAmount = By.xpath("//*[@id='fourth']/a");  //5000

    //To Options
    private By debitAccount = By.xpath("//ol[@id='bank']//li");
    private By debitAmount = By.xpath("//*[@id='amt7']/li");
    private By creditAccount = By.xpath("//*[@id='loan']/li");
    private By creditAmount = By.xpath("//*[@id='amt8']/li");

    private By result = By.xpath("//a[normalize-space()='Perfect!']");

    //constructor
    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageName() {
        return driver.findElement(pageName).getText();
    }

    public String getResult() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(result));
        return driver.findElement(result).getText();
    }

    //Drag and Drop method
    public void dragAndDrop(WebElement From, WebElement To) {
        //Using Action class for drag and drop.
        Actions act = new Actions(driver);

        act.dragAndDrop(From,To).build().perform();
    }

    //get web element
    public WebElement fromDebitAccount() {
        return driver.findElement(boxDebitAccount);
    }

    public WebElement fromDebitAmount() {
        return driver.findElement(boxDebitAmount);
    }

    public WebElement fromCreditAccount() {
        return driver.findElement(boxCreditAccount);
    }

    public WebElement fromCreditAmount() {
        return driver.findElement(boxCreditAmount);
    }

    public WebElement toDebitAccount() {
        return driver.findElement(debitAccount);
    }

    public WebElement toDebitAmount() {
        return driver.findElement(debitAmount);
    }

    public WebElement toCreditAccount() {
        return driver.findElement(creditAccount);
    }

    public WebElement toCreditAmount() {
        return driver.findElement(creditAmount);
    }
}
