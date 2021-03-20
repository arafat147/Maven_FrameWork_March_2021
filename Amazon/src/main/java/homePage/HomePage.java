package homePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import static homePage.HomePageWebELement.*;

public class HomePage extends WebAPI {
    //This class will have all the action methods:


    //find by annotation: first approach:
    @FindBy(how = How.XPATH,using = searchBoxFieldElement) public WebElement searchbox1;

    //find by annotation: second approach:
    @FindBy(css = searchBoxFieldElement) public WebElement searchbox;
    @FindBy(xpath = searchButtonElement) public WebElement searchButton;
    @FindBy(xpath = searchLaptopText) public WebElement searchLaptop;

    public void searchField() throws InterruptedException {
        searchbox.sendKeys("Mac Laptop");
        Thread.sleep(4000);
        searchButton.click();
        Thread.sleep(4000);
        String actualResult= searchLaptop.getText();
        Thread.sleep(4000);
        Assert.assertEquals(actualResult,"\"Mac Laptop\"","Keyword did not match");

    }








}
