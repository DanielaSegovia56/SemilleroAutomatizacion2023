package com.amazon.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class AddToCartStepDefinitions {

    @Managed
    WebDriver driver;

    Actor daniela = Actor.named("Daniela");

    @Before
    public void setupActor(){
        daniela.can(BrowseTheWeb.with(driver));
    }

    @Given("that user open page Amazon and search any product")
    public void thatUserOpenPageAmazonAndSearchAnyProduct() {
        daniela.attemptsTo(Open.url("https://www.amazon.com/"));
    }
    @When("user click on product tittle and user click on add to cart")
    public void userClickOnProductTittleAndUserClickOnAddToCart() {

    }
    @Then("user can read a message added yo cart")
    public void userCanReadAMessageAddedYoCart() {

    }
}
