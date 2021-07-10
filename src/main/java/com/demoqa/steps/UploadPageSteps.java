package com.demoqa.steps;

import com.demoqa.models.DataInjection;
import com.demoqa.pageobjects.UploadPage;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class UploadPageSteps {

    UploadPage uploadPage = new UploadPage();


    @Step
    public void openBrowser(){
        uploadPage.open();
    }

    @Step
    public void uploadFile(){
        uploadPage.getDriver().manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        uploadPage.sendFilename(new DataInjection().getPath());
    }

    public void validation(){
        uploadPage.sendVerification();

    }


}
