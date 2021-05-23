package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.GlbHomepage;

public class Project2AutomationTest {
	private static WebDriver driver;
	
	private static GlbHomepage glbHomepage;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ray\\Desktop\\Week-6 demos\\Project2_SeleniumTesting\\src\\main\\resources\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		driver.get("http://ec2-52-14-217-72.us-east-2.compute.amazonaws.com:8080/project2/");
		glbHomepage = new GlbHomepage(driver);
		
		
		
	}

	
	@Test
	@Order(1)
	void test_title_isCorrect() {
		
		String expected = "Project2".trim();
		
		
		assertEquals(expected, glbHomepage.getTitle());
		
	}
	
	@Test
	@Order(2)
	void test_title_10RecentGameReview() {
		String expected = "10 Newest Game Reviews'".trim();
		
		//assertEquals(expected,)
	}
	
	
	@Test
	@Order(3)
	void test_loginButtonClick() {
		
	}
	
	@Test
	@Order(4)
	void test_signupButtonClick() {
		
	}
	
	
	
	
	@AfterAll
	static void tearDownAfterClass() {
		driver.close();
	}

}
