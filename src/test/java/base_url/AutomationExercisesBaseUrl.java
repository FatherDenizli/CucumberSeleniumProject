package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class AutomationExercisesBaseUrl {



    public static RequestSpecification spec;


    public static void medunnaSetUp() {

        spec = new RequestSpecBuilder().setBaseUri("https://automationexercise.com").build();

    }


}
