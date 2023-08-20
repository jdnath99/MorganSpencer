package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class EnterInformation_StepDef {


    @Given("User is on How old are you? page")
    public void user_is_on_how_old_are_you_page() throws IOException {
        BaseClass.driverinit();

    }
    @When("Enter all the details")
    public void enter_all_the_details(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> data =     dataTable.asMaps(String.class,String.class);

        BaseClass.Homepageobj.Enteryourname(data.get(0).get("Your name"));
        BaseClass.Homepageobj.Enteryourbirthday(data.get(0).get("DOB"));
        BaseClass.Homepageobj.Submitbutton();
    }
    @Then("User should see the age")
    public void user_should_see_the_age() {


        Assert.assertEquals("Hello !" ,BaseClass.Homepageobj.getsuccessmethod());
    }


}
