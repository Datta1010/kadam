Feature: Test facebok functionlity

  Background: 
   
    When user enter valid username and valid password
    Then user is on home page and verify user is on home page or not?

  @PIMPage
  Scenario: Test PIM Page Functionality
    Then user click on PIM Link
    And user click on Add button in PIM Page
    When user enter personal Details in PIM Page add employee Functionality
    Then user fillup more personal details in PIM page Personal Details Functionality

  @AdminPage
  Scenario: Test Admin Page Functionality
    Then user click on Admin page link
    And user click on add button in Admin Page
    When create a new user

  @MyInfo
  Scenario: test My info Page
    When user click on my info page