@smoke @regression
Feature: Testing Login Functionality for OpenMrs

#  Scenario:Positive Login Functionality (Happy Path)
#    Given User Provides the username and password with 'Inpatient Ward'
#    Then User validates the 'Home' and 'https://demo.openmrs.org/openmrs/referenceapplication/home.page'

  Scenario Outline:  Negative Login Functionality
    Given User provides '<username>' and '<password>' with '<location>'
    Then User validates 'Invalid username/password. Please try again.'

    Examples:
      | username   | password  | location          |
      | admin      | asdasd    | Inpatient Ward    |
      | retreter   | Admin123  | Isolation Ward    |
      | fnfhdsjgof | bvhdkfndi | Laboratory        |
      |            |           | Outpatient Clinic |
      | @#$%%^     | !@##$%    | Pharmacy          |
      | ADMIN      | ADMIN123  | Registration Desk |







