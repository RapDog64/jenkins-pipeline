package com.pipleline;


import io.qameta.allure.Allure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("regression")
class RunTestByTags {

    @Test
    @Tag("smoke")
    @DisplayName("The first test with 'smoke' tag")
    void someTest() {
        Allure.step("The first test with 'smoke' tag");

    }


    @Test
    @Tag("sanity")
    @DisplayName("Test with 'sanity' tag")
    void sanityTest() {
        Allure.step("Test with 'sanity' tag");
    }


    @Test
    @Tag("smoke")
    @DisplayName("The Second test with 'smoke' tag")
    void secondSmokeTest() {
        Allure.step("The Second test with 'smoke' tag");
        Assertions.assertEquals(4, 3+2);
    }
}
