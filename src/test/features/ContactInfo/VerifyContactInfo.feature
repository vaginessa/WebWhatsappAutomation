##Author : H Sri Harsha
##This feature is used to verify that user is able to see contact info in whatsapp.
Feature: Verify navigate to contact info.

@ContactInfo
Scenario: Verify navigate to contact info
Given user is logged into whatsapp
When user searches for a contact "MY NUMBER"
Then user chooses the contact "MY NUMBER"
When user clicks on menu option on active chat window
Then chooses "Contact info" from menu option
And verifies Media,Links and Docs in contact info screen
