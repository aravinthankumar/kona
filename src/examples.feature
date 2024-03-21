Feature:
To validate the facebook login application

Scenario Outline:
To validate the facebook invalide login application
Given The user should be in facebook login pages
When The user has to fill "<user>" and "<password>"
And The user has to click the enter button
Then The user should enter the invalide login page

Examples:

|password|qwertyui|
|user|aravinthan|