Feature: User
  As a admin
  I want to see list of user
  So that I can create new user

  @positiveGet
  Scenario: GET valid - As admin I have be able to get detail user
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I received valid HTTP response code 200
    And I received valid data for detail user

  @positiveGetnewBranch
  Scenario: GET valid - As admin I have be able to get detail user new branch
    Given I set GET api endpoints new branch
    When I send GET HTTP request new branch
    Then I received valid HTTP response code 200 new branch
    And I received valid data for detail user new branch

  @negativeGet
  Scenario: GET invalid - As admin I not have be able to get detail user
    Given I set GET api invalid endpoints
    When I'm sending a request other than HTTP GET
    Then I received invalid response status code

  @positivePost
  Scenario: POST valid - As admin I have be able to create new user
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user

  @negativePost
  Scenario: POST invalid - As admin I not have be able to create new user
    Given I set POST api Invalid Id endpoints
    When I'm send POST HTTP request with number
    Then I receive invalid HTTP response code 404

  @positiveOneGet
  Scenario: GET valid - As admin I have be able to get user by ID
    Given I set GET api endpoints by ID
    When I send GET HTTP request by ID
    Then I received valid HTTP response code 200 by ID
    And I received valid data for get data by ID

  @negativeOneGet
  Scenario: GET invalid - As admin I not have be able to get user by ID
    Given I set GET api invalid endpoints by ID
    When I send GET HTTP request by ID 2
    Then I received invalid response status code 404

  @positivePut
  Scenario: PUT valid - As admin I have be able to update existing user
    Given I set PUT api endpoints
    When I send PUT HTTP request
    Then I received valid HTTP response code 200
    And I receive valid data for update user

  @negativePut
  Scenario: PUT invalid - As admin I not have be able to update existing user
    Given I set PUT api Invalid endpoints
    When I send PUT HTTP request 2
    Then I received invalid response status code PUT

  @positiveDelete
  Scenario: DELETE valid - As admin I have be able to delete existing user
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I received valid HTTP response code 200 delete

  @negativeDelete
  Scenario: DELETE invalid - As admin I not have be able to delete existing user
    Given I set DELETE api invalid endpoints
    When I send DELETE HTTP request 2
    Then I received invalid HTTP response code 404 delete

