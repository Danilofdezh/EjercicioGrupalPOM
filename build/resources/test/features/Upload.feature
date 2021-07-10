Feature: Upload and Download
  enter the page and upload the file


  @regression
  Scenario: Upload file
    Given enter the page
    When click the button select file
    Then the file is loaded
