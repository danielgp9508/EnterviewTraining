
@tag
Feature: BlankFactor WebPage Automation
  

  @ValidationOne
  Scenario Outline: Go to BlankFactor WebPage
    Given Access to URL
    When Open Blog section 
    And Serch specific post by name <name> 
    Then Validate inside the Blog <name>
    When Suscribe to the newsletter <mail>
    Then Validate Suscription
    And Print all Blogs  

    Examples: 
      | name 																				| mail|
      |Why Fintech in Latin America Is Having a Boom|daniel.prueba1234@prueba.com|
