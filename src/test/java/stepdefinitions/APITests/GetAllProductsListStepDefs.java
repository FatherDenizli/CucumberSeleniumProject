package stepdefinitions.APITests;

import base_url.AutomationExercisesBaseUrl;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static base_url.AutomationExercisesBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class GetAllProductsListStepDefs extends AutomationExercisesBaseUrl {


    @Given("User is on automation page and get all list")
    public void user_is_on_automation_page_and_get_all_list() {


            //Set the Url
     //       String url = "https://automationexercise.com/api/productsList";

        spec.pathParams("first","api","second","productsList");
            //Set the expected data

            //Send the request and get the response
        Response response=given().spec(spec).when().put("/{first}/{second}");
        response.prettyPrint();

        response.then().assertThat().statusCode(200);


        }



}
