package com.example;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

import org.junit.jupiter.api.Test;

@QuarkusTest
class DefaultTest {
    @Test
    void exerciseEndpoint() {
        RestAssured.get();
    }
}
