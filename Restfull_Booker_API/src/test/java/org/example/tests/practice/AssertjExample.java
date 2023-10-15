package org.example.tests.practice;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertjExample {

    public static void main(String[] args) {
    String responce_name="Sagar";
    assertThat(responce_name).isNotNull().isNotBlank().isEqualTo("Sagar");
    }

}
