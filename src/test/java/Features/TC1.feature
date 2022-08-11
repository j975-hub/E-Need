
  Feature: Mobile Name In Sorting Order
    Description:User will search mobile according to name

    Background:
      Given User will enter credential to Login Page

    @WebTest
    Scenario: Verify Item In Mobile List Page Can Be Sorted By 'Name'
      Given User Is On Landing Page
      Given User see the title of the Home page
      When  User click on mobile menu
      Then  User see the title of the Mobile page
      And   User sort mobile using "Name" dropdown
      And   User see all products are sorted by "Name"

