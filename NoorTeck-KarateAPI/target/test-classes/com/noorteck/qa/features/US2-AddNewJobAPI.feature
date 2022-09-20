Feature: SmokeTest for Job Portal Functionality

  Background: 
    * def data = read('classpath:com/noorteck/qa/data/JobAPI_TestData.json')
    * def filename = env == 'scrum' ? 'classpath:com/noorteck/qa/helper/Headers.feature@valid-auth' : 'classpath:com/noorteck/qa/helper/Headers.feature@no-auth'
  
    * def info = call read(filename)
    * def URL = baseUrl
    * configure headers = info.HEADER


  Scenario Outline: Verify User able to Create new job description
    * def PATH = addAPI
    * def REQUESTBODY = read(<req_body>)
    * set REQUESTBODY.experience[0] = <experience>
    * set REQUESTBODY.jobDescription = <desc>
    * set REQUESTBODY.jobId = <id>
    * set REQUESTBODY.jobTitle = <title>
    * set REQUESTBODY.project[0].projectName = <project>
    Given url URL
    And path PATH
    And request REQUESTBODY
    When method POST
    * print response
    Then status <status_code>
    And match response.jobId == <id>
    And match response.jobTitle == <title>
    And match response.jobDescription == <desc>
    And match response.project[0].projectName ==<project>
    And match response.experience[0] == <experience>

  @stage
    Examples: 
      | req_body         | experience               | desc                         | id                  | title                  | project                   | status_code |
      | data.requestBody | data.scrum[0].experience | data.scrum[0].jobDescription | data.scrum[0].jobId | data.scrum[0].jobTitle | data.scrum[0].projectName |         201 |

      
      # Part 1 