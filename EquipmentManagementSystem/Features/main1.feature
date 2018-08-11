Feature: Main Application

Scenario: Login Scenario invalid details
Given User wants to login to equipment tracking system application
When User enter invalid user credentials
Then display the authentication error page
When User enters the valid user credentials
Then User will be able to access the application

When admin is logged in
Then admin can do Allocate, update, move and list of the equipment
When admin clicks on allocate 
And admins location and equipment location are same
Then admin can get equipment_tag, set the user_id for equipment table, update equipment_status

When Admin clicks on update single equipment
And enters the equipment primary key clicks on submit
And the equipment has the same location as that of the user
And If the equipment has been retired 
Then allow admin to only update the comments
When Admin clicks on update single equipment
And If the equipment has status in stock 
And is not retired 
And the equipment has the same location as that of the user  
Then allow admin to update the following fields Purchase Method, Seq Number, cost center, location, audit indicator(yes/no),audit date, comments,stock location
And default fields should be user id, dept id,install date to null and useStatus to inStock 


And the equipment has the same location as that of the user who is logged in
And If the equipment has status in use 
And is not retired 
And the equipment has the same location as that of the user who is logged in 
Then allow admin to update the following fields Purchase Method, Seq Number, userid, deptid, cost center, location, audit indicator(yes/no),audit date, comments
And default fields useStatus to inUse 

When admin user clicks on view all equipments button
Then display a table containing equipment details like equipment tag, quantity of equipment, seq no, location of equipment, user id and equipment type


When admin selects move
And admins location and equipment location are same
Then admin can get the user_id, equipment_tag, update equipment_status


When admin selects query by value and clicks on get list
Then admin can get the list using equipment_tag or sequence_number or machine_id or location or user_id

When User clicks the logout button 
Then display home page