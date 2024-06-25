Feature: Automate Accounts Functionality

Scenario: Create Accounts
                                     
Given Click on toggle menu button from the left corner
And Click view All and click Sales from App Launcher
And Click on Accounts tab
And Click on New button
And Enter 'Saranya' as account name
And Select Ownership as Public    
When Click save and verify Account name
Then Account should be created Successfully

Scenario: Edit Account

Given Click on toggle menu button from the left corner
And Click on Accounts
And Search for the Account Using the unique account name 'Saranya' created by you 
And Click on the displayed Account Dropdown icon and select Edit
And Select Type as Technology Partner
And Select Industry as Healthcare 
And Enter Billing Address
And Enter Shipping Address
And Select Customer Priority as Low
And Select SLA as Silver
And Select Active as NO 
And Enter Unique Number in Phone Field
And Select Upsell Oppurtunity as No
When Click on save and verfiy Phone number
Then Account is Edited Successfully
