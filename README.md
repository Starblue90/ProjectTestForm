# ProjectTestForm

# Overview
        This project utilize Katalon to create an automated test suite for a mock web form that includes the following fields:
        
        •	Text input fields for user information (e.g., name, email address).
        
        •	A date picker for selecting dates.
        
        •	A dropdown menu for selecting an option from a predefined list.
        
        •	An attachment upload field for uploading documents.
        
        •	Radio buttons for selecting one option from a set of choices.
        
        •	A checkbox for agreeing to terms and conditions or selecting multiple options


# Setup Instructions 
        1.	Download [Katalon Studio](https://www.katalon.com/) Version 10.3.0
        2.	After the download is successful. Double click for the installation. 
        3.	Open Katalon Studio.

# Test Execution
Notes:
1. For "TC2_Positive_Successful Submission (All fields)", "TC8_Negative_Exceed File Size","TC9_Negative_File Validation", please replace the file path directory during the execution for the test cases and select the required test file from GitHub main.

2. For "TC8_Negative_Exceed File Size", the "FileSizeExceed.pdf" is too huge to upload to GitHub. Please use your own file and rename the file.
3. For "TC9_Negative_File Validation", select the required file "03 This Is The Day.wma", "Track01.cda", "TestForm.docx", "image.jpg" from GitHub main.

# Test Suites
There are 3 Test Suites to execute.

<img width="296" height="123" alt="image" src="https://github.com/user-attachments/assets/e9a9ff0d-c0a5-4a76-9ce3-deb5490cbe8e" />

Note: Before the start of any execution, please disable the security verification on CloudFlare as shown below. 
<img width="477" height="139" alt="image" src="https://github.com/user-attachments/assets/ce9f9215-2d7c-4e39-8688-b111e0c2f446" />

This verification will prevent a successful form submission.




# How to run the Tests: 
1. To execute TS1_Test Suite Scenario, click on  <img width="59" height="46" alt="image" src="https://github.com/user-attachments/assets/c61c245a-4c6c-4d58-8f33-0ed414e2c644" />
   with your desired browser.
     
2. To execute TS2_Data Driven Suite, click on <img width="59" height="46" alt="image" src="https://github.com/user-attachments/assets/3d4e86df-6010-4aa7-b6be-ce7b6e8ac109" />
   Ensure Data Binding option is as shown below.
 <img width="940" height="295" alt="image" src="https://github.com/user-attachments/assets/292f60ec-fa7d-4991-b6f6-7c0b622b22a3" />

3. To execute TS3_Cross Browser Suite, click on <img width="78" height="29" alt="image" src="https://github.com/user-attachments/assets/c34faf1e-7cce-4b89-8c5a-8aaddc49f4a5" />
 
 <img width="940" height="166" alt="image" src="https://github.com/user-attachments/assets/9754de70-83d1-4946-91f2-41a35a3a6ad8" />



4. Reports will be saved in /Reports
<img width="304" height="402" alt="image" src="https://github.com/user-attachments/assets/778aa3b7-04e2-4cac-a8d0-6bfa15d5a45a" />




# Overview of Test Strategy: 
1. Test Coverage
   
        •	The suite covers all essential form elements including text inputs, date picker, dropdown, file upload, radio buttons and checkboxes.

        •	Both positive (successful submissions) and negative (field validation and error handling) test cases are implemented.

        •	Validation checks ensure:
   
                •	Mandatory fields are completed
                •	Data format correctness (email, mobile, date format)
                •	Logical restrictions (past dates only, file size limits, valid file types)
                •	Mutually exclusive outcome for the selection of radio buttons, At 1 checkbox is required and allow multi-selection
                •	Data-driven testing enables running the form submission with multiple datasets validating robustness against varied inputs.

2. Testing Approach
   
           •	Utilizes Page Object Model (POM):
   
           •	Encapsulates page-specific locators and interactions in separate page classes (in Object Repository/Module/Test Form).
   
           •	Test cases reference these page objects to enhance maintainability and reusability.
   
           •	Tests scripted in Katalon Studio, leveraging WebUI keywords for browser automation.
   
           •	Thorough field validation is checked with positive and negative inputs to verify system robustness.

3. Data Driven Testing
   
           •	TS2_Data Driven Suite uses test_datadriven.xlsx under “Data Files” to feed multiple sets of input values.
   
           •	Binding data columns to variables enables parameterization of inputs for each test iteration.
   
           •   This method saves test development effort while expanding coverage effectively.

4. Continuous Integration & Reporting
   
           •	Designed for integration with CI tools like Jenkins or GitLab for automated scheduled runs.
   
           •	Generates detailed test execution reports located in Reports/ for test outcome analysis.
           
           •	Cross-browser compatibility verified using browser selection in Katalon Studio for real-world usage scenarios.


# Test Code Structure
<img width="253" height="575" alt="image" src="https://github.com/user-attachments/assets/e272ccd1-774a-4960-9208-09e836fe1394" />




/Test Cases/
            - Individual test scripts implementing test logic for each scenario (e.g., TC1_Positive_SuccessfulSubmission).
            
/Object Repository/FormPage/
    - Page objects representing form elements and actions (text fields, buttons, radiobuttons, checkboxes, hyperlink, labels, dropdown)
           
/Test Suites/
            - Collections of related test cases organized for execution.
            
/Test Suite Collections/
            - Aggregated collections to execute multiple test suites together for cross-browsers.
            
/Data Files/
    - External files (e.g. test_datadriven.xlsx) holding data sets driving data-driven tests.
    
/Reports/
    - Stores test execution reports automatically generated after each run.

    

    
        •	Test cases reference page objects for all UI interactions.
        
        •	Data binding links the data file to test cases enabling iterative execution over datasets.
        
        •	Negative and positive validation test cases ensure end-to-end functional verification.
        
        •	Configurations for browsers and environments facilitate cross-browser testing.


