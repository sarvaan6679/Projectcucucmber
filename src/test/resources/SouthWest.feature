Feature: To validate the functionality of depart and arrive textbox

  Scenario: To validate the textbox by passing valid depart and valid arrive
    Given user has launch the chrome browser and open the southwest url
    When user has to pass the valid city in departure text box
      | dallas | washington | denver | sanfransisco |
    And user has to pass the valid city in arrive text box
    And user has click the search button
    Then user has to close the browser

  Scenario Outline: To validate the textbox by passing bulk of values
    Given launch and hit southwest url
    When pass values in"<Arrive>" arrive field
    And pass values in "<Depart>"depart field
    And tap the search button
    Then close the browser

    Examples: 
      | Depart     | Arrive       |
      | denver     | dallas       |
      | dallas     | sanfransisco |
      | washington | denver       |
