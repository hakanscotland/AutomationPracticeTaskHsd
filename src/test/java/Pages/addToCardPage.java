package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class addToCardPage{

    public addToCardPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="//section[@id='categorymenu']/nav[@class='subnav']//a[@href='https://automationteststore.com/index.php?rt=product/category&path=49']")
    public WebElement FragranceButton;

    @FindBy(xpath="/html//div[@id='maincontainer']//div[@class='contentpanel']/ul/li[1]/div/a[@href='https://automationteststore.com/index.php?rt=product/category&path=49_51']")
    public WebElement MenCategoryButton;

    @FindBy(css="a[title='Armani Code Sport']")
    public static WebElement ArmaniCodeSport;

    @FindBy(css ="input#product_quantity")
    public WebElement InputQuantity;

    @FindBy(css = ".cart")
    public WebElement addToCartButton;

   @FindBy(css="#cart_checkout1")
    public WebElement CheckOutButton;

    @FindBy(css="#accountFrm_accountguest")
    public WebElement SelectGuestAccount;

    @FindBy(css="button[title='Continue']")
    public WebElement ContinueButton;

    @FindBy(id="guestFrm_firstname")
    public static WebElement FirstName;
    @FindBy(id="guestFrm_lastname")
    public static WebElement LastName;
    @FindBy(id="guestFrm_email")
    public static WebElement EMail;
    @FindBy(id="guestFrm_telephone")
    public static WebElement Telephone;
    @FindBy(id="guestFrm_fax")
    public static WebElement Fax;
    @FindBy(id="guestFrm_company")
    public static WebElement Company;
    @FindBy(id="guestFrm_address_1")
    public static WebElement Address1;
    @FindBy(id="guestFrm_address_2")
    public static WebElement Address2;
    @FindBy(id="guestFrm_city")
    public static WebElement City;

    @FindBy(id="guestFrm_zone_id")
    public static WebElement RegionState;

    @FindBy(id="guestFrm_postcode")
    public static WebElement Postcode;

    @FindBy(css = "tr:nth-of-type(1) > td:nth-of-type(2) > .bold")
    public WebElement SubTotal;

    @FindBy(css = "tr:nth-of-type(2) td:nth-of-type(2) .bold")
    public WebElement FlatShippingRate;

    @FindBy(css="td:nth-of-type(2) .totalamout")
    public WebElement CartTotal;

    @FindBy(id="checkout_btn")
    public WebElement ConfirmOrderButton;

    @FindBy(css="body.checkout-success:nth-child(2) div.container-fixed:nth-child(1) div.container-fluid div.col-md-12.col-xs-12.mt20 div:nth-child(1) h1.heading1 > span.maintext")
    public WebElement TextMessage;




}
