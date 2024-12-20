@Regression_TCs
Feature:F03_AddToCart | authenticated users could add item to cart
  Scenario: user can add item and select color and size
    When user is logged in to tealium website
    And user hover on accessories category
    And user select shoes subcategory
    And user filter shoes by price
    And user view the details for selected shoes
    And user select color and size
    And add the selected shoes to cart
    Then user get the checkout page after add the shoes to cart