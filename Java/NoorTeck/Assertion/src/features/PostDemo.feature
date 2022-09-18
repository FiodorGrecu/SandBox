Feature: Creating a a new job descrition

Scenario Outline:  Verify User is able to create new job description
    * def URL = 'https://jobportalkarate.herokuapp.com/secure/webapi/all'
    * def data = read('classpath:Assertion/src/data/PostDemo.json')
    * print data
    # * set experience 