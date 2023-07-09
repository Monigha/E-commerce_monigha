Feature: we can check and order cosmetic product through nykaa shopping application

@ExistingUserLogin
Scenario: user login the account by using login module
Given user Launch the nykaa application
When user click the signin button
And user click on signin with mobile or email option it pop up for entring login details
And user enter the registered mobile number or email id
And user click the proceed button
And user need to enter the otp  received in registered email or mobile number
Then if user otp matches with server it successfully login in to the application

@AddToBag
Scenario: user serach for product

When user need to search the required product in the search option provided in the page
And user need to press the enter key to see the relevant matched product for the search word
And user have to select the required product displayed on the page by click over it
And user need to handle the windows to switch to required clicked product page
And user should click the add to bag button and add to bag page will be displayed
And then user should switch to the add to bag page frame
Then user should able to validate the add to product and add to bag page will be  displayed as a same product