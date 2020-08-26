package com.studentapp.cucumber.steps;

import cucumber.api.java.it.Ma;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)


public class YourFavourites {
	 @Managed  WebDriver driver;
	
@Test	 

 @Given("^User navigates to Mixcloud website$")
 public void user_navigates_to_mixcloud_website() {
 	driver.get("https://www.mixcloud.com/");
    driver.manage().window().maximize();
 }
 @When("^User clicks on the login button on page$")
 public void user_clicks_on_the_login_button_on_page() throws Throwable {
 driver.findElement(By.xpath("//*[contains(text(), 'Login')]")).click();
 }
 @When("^User enters a valid username$")
 public void user_enters_a_valid_username() {
 	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("GregoryTest");
  }
 @When("^User enters a valid password$")
 public void user_enters_a_valid() {
 	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("qatesthillel");
  }
 @When("^User clicks on the log in button$")
 public void user_clicks_on_the_log_in_button() throws Throwable {
 	Thread.sleep(3000);
 	driver.findElement(By.xpath("//*[contains(text(),  'Log In')]")).click();
    }	
 @When("^User should be successfully logged in$")
 public void user_should_be_logged_in() throws Throwable {
 	Thread.sleep(2000);
 	WebElement GregoryTest=driver.findElement(By.xpath("//*[contains(text(), 'GregoryTest')]"));
 	Assert.assertEquals(true,  GregoryTest.isDisplayed());
 }
 @When("^User clicks Search field$")
	public void user_clicks_Search_field() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input['mixcloud_query']")).click();

	}
 @When("^User enters artistname in the Search field$")
	public void user_enters_in_the_Search_field() throws Throwable {
     driver.findElement(By.xpath("//div/input['mixcloud_query']")).sendKeys("Martin Garrix");
	}
 @When("^User clicks on artist profile$")
	public void user_click_artis_profile_button() throws Throwable {
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/span/a/p")).click();
     Thread.sleep(7000);
	}
@When("^User clicks on add to favorites button$")
    public void user_click_on_add_to_favourites_button() throws Throwable {
    driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div[4]/main/div[1]/div/div/div/div[1]/div[1]/div/div/div[3]/div/div[1]/div/p")).click();
    Thread.sleep(2000);
    }
@When("^User go back to his account page$")
    public void user_clicks_account_button() throws Throwable {
    Thread.sleep(7000);
    driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div[3]/div[3]/div/div/img")).click();
    driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div[3]/div[3]/div/div/img")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div[3]/div[3]/div[2]/div/div/div[1]/a/p")).click();
    }
@Then("^User can see audio in the list$")
    public void user_can_see_artist_in_the_list() throws Throwable {
        Thread.sleep(7000);
     WebElement MartinGarrix=driver.findElement(By.xpath("//*[contains(text(), 'The Martin Garrix Show')]"));
     Assert.assertEquals(true,  MartinGarrix.isDisplayed());
    }
@When("^User click on undo favorite button$")
    public void user_click_on_undo_favorite_button() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div[4]/main/div[1]/div/div/div[2]/div/div/div/div[3]/div/div[1]/div/p")).click();
    }
@When("^User refresh page$")
    public void user_refresh_account_page() throws Throwable {
        Thread.sleep(7000);
        driver.get(driver.getCurrentUrl());
        }
@Then("^Artist deleted from following list$")
    public void artist_deleted_from_following_list() throws Throwable {
    Thread.sleep(3000);
    Assert.assertTrue(driver.findElement(By.xpath("//b[text()='Oh no, this user hasn’t uploaded anything yet!']")).isDisplayed());
}

    }

