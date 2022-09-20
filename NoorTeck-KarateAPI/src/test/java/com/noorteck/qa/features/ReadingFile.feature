Feature: SmokeTest for Job Portal Functionality

@twoFile
  Scenario Outline: 
    * def data = read('classpath:com/noorteck/qa/data/JobAPI_TestData.json')
 		* print data
 		* print data.requestBody
    * def REQUESTBODY = read(<req_body>)
    * def rb = read('classpath:com/noorteck/qa/data/JobAPI_RequestBody.json')

    Examples: 
      | req_body         |
      | data.requestBody |
