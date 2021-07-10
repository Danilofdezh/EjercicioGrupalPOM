package com.demoqa.pageobjects;


        import com.demoqa.models.DataInjection;
        import net.serenitybdd.core.pages.PageObject;
        import net.thucydides.core.annotations.DefaultUrl;
        import org.junit.Assert;
        import org.openqa.selenium.By;
        import java.util.concurrent.TimeUnit;


@DefaultUrl("https://www.demoqa.com/upload-download")

public class UploadPage extends PageObject {


    DataInjection dataInjection = new DataInjection();

    public By buttonUpload = By.xpath("//input[@class='form-control-file']");
    public By filename = By.xpath("//p[@id='uploadedFilePath']");
    public By downloadBtn = By.id("downloadButton");

    public void sendFilename(String String) {
        getDriver().findElement(buttonUpload).sendKeys(String);
    }
    public void sendVerification(){ Assert.assertEquals("C:\\fakepath\\"+dataInjection.getFilename(), getDriver().findElement(filename).getText()); }
    public void clickBtnDownload(){
        getDriver().findElement(downloadBtn).click();
    }
}