@run
Feature: Register feature test suit

  Background:
    Given "https://demo.opencart.com/" is accesed

  Scenario: Register page URL is accesible from Home page
    When My account button is clicked
    And Register button is clicked
    Then "register" is present within the current url

  Scenario Outline: Register page url contains the following word <keyword>
    When My account button is clicked
    And Register button is clicked
    Then "<keyword>" is present within the current url
    Examples:
      | keyword          |
      | index            |
      | account/register |

