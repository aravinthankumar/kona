Feature:
The validate the facebook login page

Scenario:
The validate the facebook invalide login page
Given To user should be navigate the login page
When To user has to fill username and password
|name|pow|
And To user has to click the login button
Then To user should be enter the invalide login page
