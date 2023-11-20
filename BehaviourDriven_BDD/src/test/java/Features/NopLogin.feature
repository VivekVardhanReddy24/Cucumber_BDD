Feature: Login
@nopcommerceWebsite
  Scenario: Successful Login with Valid Credentials
      Given User Launch Chrome browser
      When User opens URl "https://admin-demo.nopcommerce.com/login"
      When User enters Email as "admin@yourstore.com" and Password as "admin"
      When Click on Login
      Then Page  should be Dashboard  nopCommerce administration
      When User Click on Log out link
      Then  Title should be Your store. Login
      Then close browser


    Scenario Outline: Login Data Driven
        Given User Launch Chrome browser
        When User opens URl "https://admin-demo.nopcommerce.com/login"
        When User enters Email as "<email>" and Password as "<password>"
        When Click on Login
        Then Page  should be Dashboard  nopCommerce administration
        When User Click on Log out link
        Then  Title should be Your store. Login
        Then close browser

        Examples:
            | email | password |
            | admin@yourstore.com	|	admin |
            | admin1@yourstore.com | admin123	|