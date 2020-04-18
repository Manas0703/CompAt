@SmokeTesting
Feature: Login To HRAcuity Application 

@PositiveLogin 
Scenario Outline: Positive-SuperAdmin Login successfully 
	Given Navigate to HRAcuity Login page URL "https://qa-demo.hracuity.net" 
	When  Enter valid "<email>" and "<password>" 
	And click on Login Button 
	And click on I Agree Button 
	And  click on his/her name 
	And select logout from the dropdown 
	Then Browser close 
	
	Examples: 
		|email               |password|
		|rkhan@hracuity.com  |9hki1*g68D|
		
		
		
		@NegativeLogin 
		Scenario Outline: Negetive-SuperAdmin Fail to Login 
			Given  Navigate to HRAcuity Login page URL "https://qa-demo.hracuity.net" 
			When   Enter Invalid "<email>" and "<password>" 
			And  click on Login Button 
			Then  Error message Dispaly 
			Then  Browser close 
			
			Examples: 
				|email             |password|
				|jbaker@hraty.net  |7%t0zhc|