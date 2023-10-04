package org.example.crud;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
public class Base {
RequestSpecification requestSpecification;
ValidatableResponse validatableResponse;
Integer bookingId;
String token;

}
