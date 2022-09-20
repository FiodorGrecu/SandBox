Feature: SmokeTest for Job Portal Functionality

  # In this feature file we are calling another feature file scenario "US2-AddNewJobAPI.feature@scrum" and using the response from the first request as part of our next request body and validation
  Background: 
    * def data = read('classpath:com/noorteck/qa/data/JobAPI_TestData.json')
    * def filename = env == 'scrum' ? 'classpath:com/noorteck/qa/helper/Headers.feature@valid-auth' : 'classpath:com/noorteck/qa/helper/Headers.feature@no-auth'
    * def info = call read(filename)
    * def URL = baseUrl
    * configure headers = info.HEADER

  Scenario Outline: Verify User able to retrieve the existing job description with valid Authentication
    * def PATH = findAPI
    * def result = call read('US2-AddNewJobAPI.feature@scrum')
    * print result.response
    Given params {id: '#(result.response.jobId)', jobTitle: '#(result.response.jobTitle)'}
    And url URL
    And path PATH
    When method GET
    * print response
    Then status <status_code>
    And match response.jobId == result.response.jobId
    And match response.jobTitle == result.response.jobTitle
    And match response.project[0].projectName == result.response.project[0].projectName

    @stage
    Examples: 
      | status_code |
      |         200 |
      #Part 2

      
     #test data
   Scenario Outline: Verify User able to retrieve the existing job description with valid Authentication
    * def PATH = findAPI
    * def result = call read('US2-AddNewJobAPI.feature@scrum')
    * print result.response
    Given params {id: '#(result.data.scrum[0].jobId)', jobTitle: '#(result.data.scrum[0].jobTitle)'}
    And url URL
    And path PATH
    When method GET
    * print response
    Then status <status_code>
    And match response.jobId == result.data.scrum[0].jobId
    And match response.jobTitle == result.data.scrum[0].jobTitle
    And match response.project[0].projectName == result.data.scrum[0].projectName

    @stage
    Examples: 
      | status_code |
      |         200 |
      #Part 2
 