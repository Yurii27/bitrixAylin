package com.bitrix.step_definitions;

import com.bitrix.pages.AnouncementPage;
import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.Configuration_Reader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;

public class AnouncementStepDefinitions {

    AnouncementPage announcement = new AnouncementPage();
    LoginPage login = new LoginPage();

    @Given("user logs in on the login page")
    public void user_logs_in_on_the_login_page() {

        Driver.getDriver().get(Configuration_Reader.getProperty("url"));

    }

    @When("user enters credentials {string} username and {string} password")
    public void user_enters_credentials_username_and_password(String string, String string2) {

        login.login(string, string2);

    }

    @Then("user clicks on more button")
    public void user_clicks_on_more_button() throws InterruptedException{
        Thread.sleep(1000);
        announcement.moreButton.click();
        Thread.sleep(1000);
    }

    @Then("user clicks on announcement")
    public void user_clicks_on_announcement()throws InterruptedException {
        Thread.sleep(1000);
        announcement.announcements.click();
        Thread.sleep(1000);


    }
    @Then("user clicks on upload icon")
    public void user_clicks_on_upload_icon() throws InterruptedException{
        Thread.sleep(1000);
        announcement.uploadIcon.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on upload files and images")
    public void user_clicks_on_upload_files_and_images() throws InterruptedException {
        Thread.sleep(1000);
        announcement.uploadFilesAndImages.click();
        Thread.sleep(1000);

    }
    @Then("user clicks on select Documents From Bitrix24")
    public void user_clicks_on_select_Documents_From_Bitrix24() {

    }
    @Then("user clicks on downloadFromExternalDriveOffice365")
    public void user_clicks_on_downloadFromExternalDriveOffice365() {

    }
    @Then("user clicks on create Using Google Docs Document")
    public void user_clicks_on_create_Using_Google_Docs_Document() {

    }

    @Then("user clicks on add more and clicks on recents, employees and departments and email users")
    public void user_clicks_on_add_more_and_clicks_on_recents_employees_and_departments_and_email_users() {

    }


}
