# Login Module - Manual Test Cases

| TC ID | Test Description | Steps | Expected Result | Priority |
|-------|------------------|--------|-----------------|----------|
| TC_01 | Verify user is able to login with valid credentials | 1. Launch application 2. Enter valid username and password 3. Click on Login button | User should be navigated to Dashboard page successfully | High |
| TC_02 | Verify logged-in user can access dashboard features | 1. Login with valid credentials 2. Observe dashboard screen | Dashboard widgets, menus and user profile options should be displayed properly | High |
| TC_03 | Verify error message is displayed for incorrect password | 1. Enter valid username 2. Enter incorrect password 3. Click Login | System should display "Invalid credentials" message and prevent login | High |
| TC_04 | Verify system behaviour when username is not registered | 1. Enter an invalid username 2. Enter any password 3. Click Login | User should remain on login page and receive an authentication error message | High |
| TC_05 | Verify validation message when username field is left empty | 1. Leave username field blank 2. Enter password 3. Click Login | Required field validation should be displayed for username field | High |
| TC_06 | Verify validation message when password field is left empty | 1. Enter username 2. Leave password field blank 3. Click Login | Required field validation should be displayed for password field | High |
| TC_07 | Verify application restricts access to protected pages without authentication | 1. Copy dashboard URL 2. Open a new browser session 3. Paste dashboard URL directly | Application should redirect user to Login page instead of allowing access | Medium |
| TC_08 | Verify application response when username exceeds expected character limit | 1. Enter a username containing more than 50 characters 2. Enter password 3. Click Login | System should handle the input gracefully and login should not be successful | Medium |

## Test Coverage Summary

Positive Test Cases:
- TC_01
- TC_02

Negative Test Cases:
- TC_03
- TC_04
- TC_05
- TC_06
- TC_07

Boundary Value Test Case:
- TC_08