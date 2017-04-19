package stepdefinitions;

/**
 * Created by Orasi_SA on 4/13/2017.
 */
import cucumber.api.java.en.Given;
import cucumber.api.java.en.*;
import java.net.URI;
import com.hp.lft.report.Reporter;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;



public class SendMessage {
    @Given("^Chinese \\(Simplified\\) Keyboard has been selected in Settings$")
    public void chinese_Simplified_Keyboard_has_been_selected_in_Settings() throws Throwable {
        Browser browser = BrowserFactory.launch(BrowserType.FIREFOX);
        browser.navigate("http://www.orasi.com");
        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("menu-text fusion-button button-default button-large").tagName("SPAN").innerText("CONTACT US").build()).click();


        browser.closeAllTabs();
    }

    @Given("^Messaging app is launched$")
    public void messaging_app_is_launched() throws Throwable {

    }

    @When("^I select the globe icon in a text message$")
    public void i_select_the_globe_icon_in_a_text_message() throws Throwable {

    }

    @Then("^The Chinese \\(Simplified\\) keyboard should be available and I can text in Mandarin\\.$")
    public void the_Chinese_Simplified_keyboard_should_be_available_and_I_can_text_in_Mandarin() throws Throwable {

    }

    @Given("^Hebrew Keyboard has been selected in Settings$")
    public void hebrew_Keyboard_has_been_selected_in_Settings() throws Throwable {

    }

    @Then("^The Hebrew keyboard should be available and I can text in Hebrew\\.$")
    public void the_Hebrew_keyboard_should_be_available_and_I_can_text_in_Hebrew() throws Throwable {

    }

    @Given("^Polish Keyboard has been selected in Settings$")
    public void polish_Keyboard_has_been_selected_in_Settings() throws Throwable {

    }

    @Then("^The Polish keyboard should be available and I can text in Polish\\.$")
    public void the_Polish_keyboard_should_be_available_and_I_can_text_in_Polish() throws Throwable {

    }

    @Given("^English Keyboard has been selected in Settings$")
    public void english_Keyboard_has_been_selected_in_Settings() throws Throwable {

    }

    @Then("^The English keyboard should be available and I can text in English\\.$")
    public void the_English_keyboard_should_be_available_and_I_can_text_in_English() throws Throwable {

    }

}
