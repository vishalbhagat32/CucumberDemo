Feature: AUT Login parametrization
  @tag1
  Scenario Outline: : Verify the Sign in page multiple
    Given user navigates to the search Homepage
    When User enters the "<search>" details
    Then User get logged in

    Examples:
    |search|
    |bb ki vines|
    |delhi|
