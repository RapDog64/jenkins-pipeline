package com.pipleline;


import io.qameta.allure.Allure;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("regression")
class RunTestByTags {

    @Test
    @Tag("smoke")
    void someTest() {
        Allure.step("Test with 'smoke' tag");

    }


    @Test
    @Tag("sanity")
    void sanityTest() {
        Allure.step("Test with 'sanity' tag");
    }
}
