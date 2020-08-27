@announcement
Feature: As a user I should be able to send anouncements from Anouncement subheading from "More" under the Activity Stream

  Background:
    Given user logs in on the login page

  Scenario Outline:  <username> should be able to upload files, add users and recepients, attach links, insert videos,
  create a quote, add mention, click on Visual editor, click on Topic icon, record video, add tags.
   When user enters credentials "<username>" username and "<password>" password
    Then user enters dashpage
    Then user clicks on more button
    Then user clicks on announcement
    Then user clicks on upload icon
    Then user clicks on upload files and images
    Then user clicks on select Documents From Bitrix24
    Then user clicks on downloadFromExternalDriveOffice365
    Then user clicks on create Using Google Docs Document
    Then user clicks on add more and clicks on recents, employees and departments and email users




    Examples:
      | username                      | password |
      | hr4@cybertekschool.com        | UserUser |
     # | hr3@cybertekschool.com        | UserUser |
     # | helpdesk3@cybertekschool.com  | UserUser |
     # | helpdesk4@cybertekschool.com  | UserUser |
     # | marketing3@cybertekschool.com | UserUser |
     # | marketing4@cybertekschool.com | UserUser |


