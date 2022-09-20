Feature: Set up Headers

	@valid-auth
  Scenario: Headers with Valid Authentication
  	* def auth = auth_valid
    * def HEADER = {Content-Type: 'application/json', Accept: 'application/json', Authorization: '#(auth)'}

	@invalid-auth
  Scenario: Headers with In-valid Authentication
    * def auth = auth_invalid
    * def HEADER = {Content-Type: 'application/json', Accept: 'application/json', Authorization: '#(auth)'}

	@no-auth
  Scenario: Headers with no Authentication
    * def HEADER = {Content-Type: 'application/json', Accept: 'application/json'}
