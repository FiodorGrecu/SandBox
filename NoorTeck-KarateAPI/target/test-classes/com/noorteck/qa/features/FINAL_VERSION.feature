Feature: SmokeTest for Job Portal Functionality

  Background: 
    * def data = read('classpath:com/noorteck/qa/data/JobAPI_TestData.json')
    * def filename = env == 'scrum' ? 'classpath:com/noorteck/qa/helper/Headers.feature@valid-auth' : 'classpath:com/noorteck/qa/helper/Headers.feature@no-auth'
    * def info = call read(filename)
    * def URL = baseUrl
    * configure headers = info.HEADER

  #1.Creating new resource POST REQUEST
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

    @scrum
    Examples: 
      | req_body         | experience               | desc                         | id                  | title                  | project                   | status_code |
      | data.requestBody | data.scrum[0].experience | data.scrum[0].jobDescription | data.scrum[0].jobId | data.scrum[0].jobTitle | data.scrum[0].projectName |         201 |

    @sit
    Examples: 
      | req_body         | experience             | desc                       | id                | title                | project                 | status_code |
      | data.requestBody | data.sit[0].experience | data.sit[0].jobDescription | data.sit[0].jobId | data.sit[0].jobTitle | data.sit[0].projectName |         201 |

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

    @sit
    Examples: 
      | id                | title                | project                 | status_code |
      | data.sit[0].jobId | data.sit[0].jobTitle | data.sit[0].projectName |         200 |

  #3.Updating the resource we create in scenario 1 with PUT REQUEST
  Scenario Outline: Verify User able to Update job description
    * def PATH = updateAPI
    * def REQUESTBODY = read(<req_body>)
    * set REQUESTBODY.experience[0] = <experience>
    * set REQUESTBODY.jobDescription = <desc>
    * set REQUESTBODY.jobId = <id>
    * set REQUESTBODY.jobTitle = <title>
    * set REQUESTBODY.project[0].projectName = <project>
    Given url URL
    And path PATH
    And request REQUESTBODY
    When method PUT
    * print response
    Then status <status_code>
    And match response.jobId == <id>
    And match response.jobTitle == <title>
    And match response.jobDescription == <desc>
    And match response.project[0].projectName ==<project>
    And match response.experience[0] == <experience>

    @scrum
    Examples: 
      | req_body         | experience               | desc                         | id                  | title                  | project                   | status_code |
      | data.requestBody | data.scrum[0].experience | data.scrum[0].jobDescription | data.scrum[0].jobId | data.scrum[0].jobTitle | data.scrum[0].projectName |         200 |

    @sit
    Examples: 
      | req_body         | experience             | desc                       | id                | title                | project                 | status_code |
      | data.requestBody | data.sit[0].experience | data.sit[0].jobDescription | data.sit[0].jobId | data.sit[0].jobTitle | data.sit[0].projectName |         200 |

  #4. Partially Updating the resource we create in scenario 1 with PATCH REQUEST
  Scenario Outline: Verify Use able to update specific field for existing job
    * def PATH = detailsAPI
    Given params {id: '#(<id>)', jobTitle: '#(<title>)', jobDescription: '#(<desc>)'}
    And url URL
    And path PATH
    And request {}
    When method PATCH
    * print response
    Then status <status_code>
    And match response.jobId == <id>
    And match response.jobTitle == <title>
    And match response.jobDescription == <desc>

    @scrum
    Examples: 
      | id                  | title                      | desc                      | status_code |
      | data.scrum[0].jobId | data.scrum[0].upd_jobTitle | data.scrum[0].upd_jobDesc |         200 |

    @sit
    Examples: 
      | id                | title                    | desc                    | status_code |
      | data.sit[0].jobId | data.sit[0].upd_jobTitle | data.sit[0].upd_jobDesc |         200 |

  #3.Deleting the resource we create in scenario 1 with DELETE REQUEST
  Scenario Outline: Verify User able to Delete existing job description with valid Authentication
    * def PATH = removeAPI + '/'+ <id>
    Given url URL
    And path PATH
    When method DELETE
    * print response
    Then status <status_code>
    And match response.jobId == <id>
    And match response.jobTitle == <title>
    And match response.jobDescription == <desc>

    @scrum
    Examples: 
      | id                  | title                      | desc                      | status_code |
      | data.scrum[0].jobId | data.scrum[0].upd_jobTitle | data.scrum[0].upd_jobDesc |         200 |

    @sit
    Examples: 
      | id                | title                    | desc                    | status_code |
      | data.sit[0].jobId | data.sit[0].upd_jobTitle | data.sit[0].upd_jobDesc |         200 |
