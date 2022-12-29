
@tag
Feature: Login
  @tag1
  Scenario: Verify the valid login credentials 
    Given i open the browser using url as "https://facebook.com"
    Then i should see the facebook login page
    When i enter the username as "<email>" and password as "<pwd>" 
    And i click the login button
    Then i should see the homepage 
   

 
    Examples: 
      | email        | pwd        | 
      | 9090147394   | Das@123%   | 
      | 8093659130   | Das@123%   | 
