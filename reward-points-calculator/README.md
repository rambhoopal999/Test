## Reward points service

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.   
A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent
over $50 in each transaction  (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).   
Given a record of every transaction during a three-month period, calculate the reward points earned for each customer
per month and total.

- Make up a data set to best demonstrate the solution
- Check solution into GitHub

#### `Process for running the project`

$ git clone

$ mvn spring-boot: run

$ This service has an end point with GET Request method which takes the transaction amount in the request url and
returns the calculated reward points in response.
$http://localhost:8080/reward-points/transaction/<tranactionAmount>
$ sample URL: http://localhost:8080/reward-points/transaction/120