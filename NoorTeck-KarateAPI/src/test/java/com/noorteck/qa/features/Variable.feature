
Feature: Title of your feature

  Background: 
    * def data = read('classpath:com/noorteck/qa/data/JobAPI_TestData.json')
    * def filename = env == 'scrum' ? 'classpath:com/noorteck/qa/helper/Headers.feature@valid-auth' : 'classpath:com/noorteck/qa/helper/Headers.feature@no-auth'
    * def info = call read(filename)
    * def URL = baseUrl
    * configure headers = info.HEADER

@var2
  #2.Retrieving the resource we create in scenario 1 with GET REQUEST
  Scenario Outline: Verify User able to retrieve the existing job description
    * def PATH = findAPI
    Given params {id: '#(<id>)', jobTitle: '#(<title>)'}
    And url URL
    And path PATH
    When method GET
    * print response
    Then status <status_code>
    And match response.jobId == <id>
    And match response.jobTitle == <title>
    And match response.project[0].projectName == <project>

    @scrum
    Examples: 
      | id                  | title                  | project                   | status_code |
      | data.scrum[0].jobId | data.scrum[0].jobTitle | data.scrum[0].projectName |         200 |
      
    @var2  
   #2.Retrieving the resource we create in scenario 1 with GET REQUEST
  Scenario Outline: Verify User able to retrieve the existing job description
    * def PATH = findAPI
    Given params {id: '#(<id>)', jobTitle: '#(<title>)'}
    And url URL
    And path PATH
    When method GET
    * print response
    Then status <status_code>
    And match response.jobId == <id>
    And match response.jobTitle == <title>
    And match response.project[0].projectName == <project>

    @scrum
    Examples: 
      | id                  | title                  | project                   | status_code |
      | data.scrum[0].jobId | data.scrum[0].jobTitle | data.scrum[0].projectName |         200 |
      