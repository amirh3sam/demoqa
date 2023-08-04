package com.demoqa.step_definitions;

import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class Upload_download {
    WebElement fileInput;
    public String baseUrl= ConfigurationReader.getProperty("baseUrl");

    @Given("user is on {string} page")
    public void user_is_in_upload_download_page(String path) {
        Driver.getDriver().get(baseUrl+path);
    }
    @When("user click on choose File button")
    public void user_click_on_choose_file_button() {
        Actions actions = new Actions(Driver.getDriver());
        fileInput = Driver.getDriver().findElement(By.xpath("//input[@id='uploadFile']"));

        actions.moveToElement(fileInput).click().perform();



    }
    @Then("user choose the file and click open")
    public void user_choose_the_file_and_click_open() {
        // Provide the path to the file you want to upload
        String filePath = "C:\\Users\\amirh\\Downloads\\chinook.db";
        File file = new File(filePath);

        // Enter the file path in the file input element
        fileInput.sendKeys(file.getAbsolutePath());
    }

}
