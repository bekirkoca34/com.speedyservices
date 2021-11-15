
@login
  Feature:loginpage
    Scenario: user login to system with invalid credantials
    Given user Open chrome browser and navigates to URL "speedyservices_url"
    Then  user click sign in icon and login using "Username" and "Password"
    And   user click login button
    Then  user verifies Assert message “Username or password is invalid”
