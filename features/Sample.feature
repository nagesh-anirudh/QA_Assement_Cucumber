Feature: Entering the invalid credentials in the opencart url
  

Scenario Outline: sample test for Opencart
  Given Opencart Url is been opened
  Then I should see "<title>" as page title
  When I Click on login
  And Enter "<username>" and "<password>"
  When I click on the Login Button
  Then I should see error message
  Then Close the browser
  
	Examples:
	    | title   | username  | password | 
	    | OpenCart - Open Source Shopping Cart Solution | dummyuser | dummy123 |
