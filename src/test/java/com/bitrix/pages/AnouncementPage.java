package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnouncementPage {

    public AnouncementPage(){ PageFactory.initElements(Driver.getDriver(), this); }
//1st AC
    @FindBy (id = "feed-add-post-form-link-text")
    public WebElement moreButton;

    @FindBy (xpath = "//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-important feed-add-post-form-important-more ']")
    public WebElement announcements;

    @FindBy (xpath = "(//span[@title='Upload files'])[1]")
    public WebElement uploadIcon;

    @FindBy (linkText = "(//span[.='Upload files and images'])[1]")
    public WebElement uploadFilesAndImages;

    @FindBy (linkText = "(//span[.='Select document from Bitrix24'])[1]")
    public WebElement selectDocumentsFromBitrix24;

    // Gives a BUG
    @FindBy (linkText = "(//span[.='Office 365'])[1]")
    public WebElement downloadFromExternalDriveOffice365;

    // Gives a BUG
    @FindBy (linkText = "(//span[.='Document'])[1]")
    public WebElement createUsingGoogleDocsDocument;


    //2nd AC
    @FindBy (linkText = "//a[text()='Add more']")
    public WebElement addMore;

    @FindBy (xpath = "//div[@class='bx-finder-box-tabs']/a[1]")
    public  WebElement recent;

    @FindBy (xpath = "//div[@class='bx-finder-box-tabs']/a[2]")
    public WebElement EmployeesAndDepartments;

    @FindBy (xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-email bx-finder-box-tab-selected']")
    public WebElement eMailUsers;


    //3nd AC
    @FindBy (xpath = "//span[@class=\'bxhtmled-top-bar-btn bxhtmled-button-link\']")
    public WebElement linkIcon;

    @FindBy (xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkText;

    @FindBy (xpath = "linkidPostFormLHE_blogPostForm-href")
    public  WebElement linkURL;

    @FindBy (xpath = "//input[@value='Save']")
    public WebElement saveLinkButton;

    //4th AC BUG here

    @FindBy (xpath = "//span[@title='Insert video']")
    public WebElement videoIcon;

    @FindBy (xpath = "//input[@placeholder='YouTube or Vimeo video URL']")
    public WebElement videoURL;

    @FindBy (xpath = "//input[@class='adm-btn-save']")
    public WebElement saveVideo;








}
