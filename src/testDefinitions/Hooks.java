package testDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
    public void beforeScenario(){
        System.out.println("*************Before Scenario***********");
    }	
	@After
    public void afterScenario(){
        System.out.println("############After Scenario##########");
    }
	@Before("@Sanity")
    public void beforeGoogle(){
        System.out.println("*******before Google*******");
    }	
	@Before("@Smoke")
    public void beforeBing(){
        System.out.println("*********before Bing*******");
    }	
	@Before("@Regression")
    public void beforeDuckDuckGO(){
		System.out.println("*********before DuckDuckGO*******");
    }
	@After("@Sanity")
    public void afterGoogle(){
        System.out.println("$$$$$$$$$$$ After Google $$$$$$$$$$");   
    }	
	@After("@Smoke")
    public void afterBing(){
		System.out.println("$$$$$$$$$$$ After Bing $$$$$$$$$$");   
    }	
	@After("@Regression")
    public void afterDuckDuckGo(){
        System.out.println("$$$$$$$$$$$ After DuckDuckGo $$$$$$$$$$");    
    }	
}