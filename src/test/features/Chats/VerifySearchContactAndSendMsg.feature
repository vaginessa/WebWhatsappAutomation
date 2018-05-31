##Author : H Sri Harsha
##This feature is used to search a contact and send a message in whatsapp.
Feature: Verify search contact and send message.

@Scenario1
@VerifySearchAndSendMsg
@ignore
Scenario: Verify search contact and send message
Given user is logged into whatsapp
When user searches for a contact "MY NUMBER"
Then user chooses the contact "MY NUMBER"
And sends the message "Hello. This is an automated test message."
