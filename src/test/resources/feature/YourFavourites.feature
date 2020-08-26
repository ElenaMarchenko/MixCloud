 Feature: Logged in user should be able to search  for necessary music artist and then  play all available tracks.


 Background: Login into account with correct credentials
  Given User navigates to Mixcloud website
  When User clicks on the login button on page
  And User enters a valid username
  And User enters a valid password
  When User clicks on the log in button
  Then User should be successfully logged in


 Scenario: Adding artist to favourite
  Given User clicks Search field
  When User enters artistname in the Search field
  And User clicks on artist profile
  When User clicks on add to favorites button
  When User go back to his account page
  Then User can see audio in the list
  When User click on undo favorite button
  When User refresh page
  Then Artist deleted from following list