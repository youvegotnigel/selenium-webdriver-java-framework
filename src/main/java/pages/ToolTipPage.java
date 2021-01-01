package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTipPage {

    private WebDriver driver;
    private By downloadButton = By.xpath(".//*[@id='download_now']");
    private By toolTipElement = By.xpath(".//*[@class='box']/div/a");

    public ToolTipPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void moveMouseToDownloadButton(){
        Actions actions = new Actions (driver);
        actions.clickAndHold().moveToElement(driver.findElement(downloadButton)).build().perform();
    }

    public String getToolTipValue(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(toolTipElement));
        return driver.findElement(toolTipElement).getText();
    }

    public void clickOnToolTip(){
        driver.findElement(toolTipElement).click();
    }
}
