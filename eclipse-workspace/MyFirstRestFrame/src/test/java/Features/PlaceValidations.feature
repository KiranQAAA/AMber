

Feature: Validating Place API's
  I want to use this template for my feature file
  
  
  Scenario: Verify if Place Api is being successfully added using AddPlaceApi 
    Given Add place payload 
  
    When user calls "AddplaceApi" with post Http request 
   
    Then  Api call is success got status code 200
   And "Status" in the  responce body Is "OK"
   And "scope" in responce body is "App" 