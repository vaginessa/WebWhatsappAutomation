##Author : H Sri Harsha
##This feature is used check last seen
Feature: Check last seen

@Scenario1
@VerifySearchAndSendMsg
Scenario: Verify search contact and send message
Given user is logged into whatsapp
When user searches for a contact "MY NUMBER"
Then user chooses the contact "MY NUMBER"
And checks for last seen
