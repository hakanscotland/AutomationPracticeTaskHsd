package Step_Definitions;

import Pages.AbstractClass;
import Pages.addToCardPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class addtoCardSteps extends AbstractClass {
    addToCardPage addToCardPage = new addToCardPage();

    @Given("Go to the test website")
    public void go_to_the_test_website() {
        System.out.println("Opening Shopping Page");
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @Given("Click on Fragrance Tab")
    public void click_on_Fragrance_Tab() {

        clickFunction(addToCardPage.FragranceButton);

        System.out.println("Clicked on Fragrance Tab");
    }

    @Given("Click Men Categories Tab")
    public void click_Men_Categories_Tab() {
        clickFunction(addToCardPage.MenCategoryButton);

        System.out.println("Clicked on Men Category Tab");
    }

    @Given("Click Armani Code Sport Product")
    public void click_Armani_Code_Sport_Product() {

        clickFunction(addToCardPage.ArmaniCodeSport);
        System.out.println("Clicked on ArmaniCode Sport Product");

    }

    @Given("Add Quantity")
    public void add_Quantity() throws InterruptedException {
        addToCardPage.InputQuantity.clear();
        sendKeysFunction(addToCardPage.InputQuantity, "2");

       System.out.println("Quantity Added");
        Thread.sleep(6000);

    }


    @Given("Click on Add to cart button")
    public void click_on_Add_to_cart_button() {
        clickFunction(addToCardPage.addToCartButton);
        System.out.println("Clicked on Add to Cart button");

    }

    @Given("click to Proceed to checkout")
    public void click_to_Proceed_to_checkout() {
        clickFunction(addToCardPage.CheckOutButton);
        System.out.println("Clicked on CheckOut button");
    }

    @Given("select check box as  Guest Checkout")
    public void select_check_box_as_Guest_Checkout() {
        clickFunction(addToCardPage.SelectGuestAccount);
//        String expectedGuest = "checked";
//        String actualGuest = addToCardPage.SelectGuestAccount.getText();
//
//        System.out.println("Expexted: "+ expectedGuest);
//        System.out.println("Actual: " + actualGuest);
//        Assertion(expectedGuest,actualGuest);
        System.out.println("Select check box as Guest Checkout");

    }

    @Given("Click Continue Button")
    public void click_Continue_Button() {
        clickFunction(addToCardPage.ContinueButton);
        System.out.println("Clicked on Continue button");
    }

    @Given("Fill the \\(GUEST CHECKOUT STEP1 form)")
    public void fill_the_GUEST_CHECKOUT_STEP1_form() {
        sendKeysFunction(addToCardPage.FirstName, "John");
        sendKeysFunction(addToCardPage.LastName, "Doe");
        sendKeysFunction(addToCardPage.EMail, "siparis@msn.com");
        sendKeysFunction(addToCardPage.Telephone, "07459900232");
        sendKeysFunction(addToCardPage.Fax, " ");

        sendKeysFunction(addToCardPage.Company, " ");
        sendKeysFunction(addToCardPage.Address1, "Berkeley");
        sendKeysFunction(addToCardPage.Address2, "3/2");
        sendKeysFunction(addToCardPage.City, "Glasgow");

        selectElementFromDropdown(addToCardPage.RegionState, "3551");

        sendKeysFunction(addToCardPage.Postcode, "G333JR");

        System.out.println("Filled out Guest Form Fields");
    }


    @When("Click Continue Button for CHECKOUT CONFIRMATION")
    public void click_Continue_Button_for_CHECKOUT_CONFIRMATION() {
        clickFunction(addToCardPage.ContinueButton);
        System.out.println("Clicked on Continue button");


    }



    @Then("the cart Sub-Total should	{string}")
    public void the_cart_Sub_Total_should(String string) {

        String expectedSubtotal = string;
        String actualSubtotal = addToCardPage.SubTotal.getText();

        System.out.println("Expected Subtotal: " + expectedSubtotal);
        System.out.println("Actual Subtotal: " + actualSubtotal);
       Assertion(expectedSubtotal,actualSubtotal);


    }

    @Then("the cart Flat Shipping Rate should	{string}")
    public void the_cart_Flat_Shipping_Rate_should(String string) {

        String expectedFlatShippingRate = string;
        String actualFlatShippingRate = addToCardPage.FlatShippingRate.getText();

        System.out.println("Expexted FlatShippingRate: " + expectedFlatShippingRate);
        System.out.println("Actual FlatShippingRate: " + actualFlatShippingRate);
        Assertion(expectedFlatShippingRate,actualFlatShippingRate);

    }

    @Then("the cart total is should {string}")
    public void the_cart_total_is_should(String string) {

        String expectedCartTotal = string;
        String actualCartTotal = addToCardPage.CartTotal.getText();

        System.out.println("Expected CartTotal: " + expectedCartTotal);
        System.out.println("Actual CartTotal: " + actualCartTotal);
        Assertion(expectedCartTotal,actualCartTotal);
    }

    @When("Click Confirm Order Button")
    public void click_Confirm_Order_Button() {
        clickFunction(addToCardPage.ConfirmOrderButton);
        System.out.println("Clicked on Confirm Order button");
    }

    @Then("The text message should appear {string}")
    public void the_text_message_should_appear(String string) {

        String expectedTextMessage = string;
        String actualTextMessage = addToCardPage.TextMessage.getText();

        System.out.println("Expected TextMessage: " + expectedTextMessage);
        System.out.println("Actual TextMessage: " + actualTextMessage);
        Assertion(expectedTextMessage,actualTextMessage);

    }




}

