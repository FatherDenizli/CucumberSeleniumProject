package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class AutomationExercisesBaseUrl {



    public static RequestSpecification spec;


    public static void automationExercisesSetUp() {

        spec = new RequestSpecBuilder().setBaseUri("https://automationexercise.com/").build();

    }


}

