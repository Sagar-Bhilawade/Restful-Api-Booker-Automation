package org.example.tests.crud;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.example.endpoint.APIConstants;
import org.example.tests.base.BaseTest;
import org.testng.annotations.Test;

public class CreateBooking extends BaseTest {
    @Owner("Shagie")
    @Description("Verify the create booking is working fine")
    @Severity(SeverityLevel.CRITICAL)
    @Test(groups = {"po","sanity"})
    public void testCreateBooking() throws JsonProcessingException {
         requestSpecification.basePath(APIConstants.CREATE_AND_UPDATE_BOOKING_URL);
         response= RestAssured.given().spec(requestSpecification).when().body(payLoadManager.createPayload()).post();
         validatableResponse=response.then().log().all();
         jsonPath= JsonPath.from(response.asString());
        System.out.println(jsonPath.getString("bookingid"));

     }
}
