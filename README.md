# BuildxActCucumberJava
## this proiect develop using Cucumber, Java, and Selenium. All the dependencies load using pom.xml.

### Note
 Chrome webdriver need to add manually base on your chrome version and copy to drivers folder.

 
 ## Test Cases
 
 Feature: Login with Valid Username and Password

  Scenario: Login to the Buildxact app with valid username and password
  
    Given User Navigate to "https://app-v2-staging.buildxact.com/"
    When User Enter username as "shanaka01@email.ghostinspector.com" and Password as "Test@1234"
    And click Login
    Then should display Dashboard title "Buildxact-stg: Dashboard"
    When User Click Logout
    Then Login page title should display as "Buildxact-stg: Login"
    And Close the browser
    
Feature: Reset password and verify email and login

  Scenario: User login with valid username and pass word and reset the password
  
    Given User Navigate to "https://app-v2-staging.buildxact.com/"
    And User Enter username as "shanaka02@email.ghostinspector.com" and Password as "Test@123"
    And click Login
    Then should display Dashboard title "Buildxact-stg: Dashboard"
    When Click My Profile
    And Click Reset Password
    Then Confirmation massage should display
    Then user should able to click Logout
    And Close the browser
    
    
    When User Navigate to "https://email.ghostinspector.com/shanaka02"
    And Open Password Reset request email
    Then Click "RESET PASSWORD"
    #Then Fill Password Field should display
    And Confirm Password Field should display
    When User Enter New Password as "Test@1234"
    And Confirm Password as "Test@1234"
    And click Confirm
    Then should display Dashboard title "Buildxact-stg: Dashboard"
    And user should able to click Logout
    When User Enter username as "shanaka02@email.ghostinspector.com" and Password as "Test@123"
    And click Login
    Then Error Message should display
     And Close the browser


 Feature: Create new  user and validate the email

  Scenario: Create New user and login with new user
  
    Given User Navigate to "https://app-v2-staging.buildxact.com/"
    And User Enter username as "shanaka02@email.ghostinspector.com" and Password as "Test@123"
    And click Login
    Then should display Dashboard title "Buildxact-stg: Dashboard"
    When Click My Business
    And Click Add Users
    And Click + button
    Then New user form should display
    
     
    When user enter first name as "sha7"
    And last name as "sha7"
    And email as "sha7@email.ghostinspector.com"
    And mobile number as "0430777777"
    Then User should click create
    

    
    When User Navigate to "https://email.ghostinspector.com/sha7"
    And Open Activate email
    And Click "ACTIVATE"
    Then Fill Password Field should display
    And Confirm Password Field should display
    
    When User Enter New Password as "Test@123"
    And Confirm Password as "Test@123"
    And click Confirm
    Then should display Dashboard title "Buildxact-stg: Dashboard"
    And user should able to click Logout
    And Close the browser


 
 
