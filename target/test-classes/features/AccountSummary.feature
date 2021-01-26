Feature: Navigation on Pages

  Scenario:Account Summary page connection
   When  user clicks on "Account Summary"
    Then Page title should be changed to " "
    And Account	summary	page	should	have	to	following	account	types:
      |Cash	Accounts        |
      |Investment	Accounts|
      |Credit	Accounts    |
      |Loan	Accounts        |

  Scenario:Account Activity page connection
    When  user clicks on "Account Activity"
    Then Page title should be changed to " "
    And In	the	Account	drop down default option should	be Savings
    Then Account	drop	down	should	have	the	following	options:
      |Savings      |
      |Checking     |
      |Loan         |
      |Credit	Card|
      |Brokerage    |
    And Transactions table should have following column names:
      |Date         |
      |Description  |
      |Deposit      |
      |Withdrawal   |


  Scenario: Pay Bills page connection

      When  user clicks on "Pay Bills"
      Then Page title should be changed to " "
      When user completes a successful Pay operation takes success message
      And user tries to make a payment without entering the	amount or date,error message should	be displayed


