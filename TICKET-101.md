# TICKET-101 conclusion

## Task

Write an automated loan decision engine

## Requirements

- Takes in a valid personal code, loan amount and loan period (in months)
- Returns a decision (negative or positive) and the approved maximum amount for the specified time period
    - If a suitable loan amount is not found within the selected period, the decision engine should also try to find a new suitable period.

## Review

**Well** **done**

+ Takes in the required inputs
+ Correct constraints for inputs
+ Checks if the given personal code is valid
+ Returns a smaller maximum amount if the allowed amount for specified time period is less than requested amount
+ Supports 4 different credit modifier scenarios 

- - - 

**Places** **for** **improvement**
- In front-end, the slider minimum period is **12** **months** as specified but start value under the slider says **6** **months**
- When the loan amount is less than maximum amount for the **given** **time** **period**, the decision engine **does** **not** **return** **the** **maximum** **amount** as specified
- If a suitable loan amount is not found within the specified period, the decision engine does not try to **find** **a** **new** **suitable** **period**

- - -
**Most** **important** **shortcoming**

A Credit scoring algorithm is missing

## Fixes

- Implemented **credit** **scoring** algorithm

- Added code to use credit **scoring** **algorithm** to either
    - **Extend** **loan** **period** to allow customer to get the requested loan
    - Return bigger loan amount if customer's **credit** **score** allows for **more** **loan** for specified period

- Modified `outputLoanAmount` to allow **bigger** **loan** amounts **for** clients with **better** **credit** **score**
- Simplified code in front end `loan-form.dart` to allow **bigger** **loan** amounts **for** clients with **better** **credit** **score** - previous code did not allow larger loan amount to be returned than the one parsed
- Replaced **6** **months** with **12** **months** in front-end application, at the period slider start point

## TICKET-102

- Implemented loan age restrictions specified in **TICKET-102** with function `verifyCustomerAge`, added `InvalidCustomerAgeException`, updated various files with the new exception, added relevant tests
    - Implemented `EstonianPersonalCodeParser.getAge` from [estonian-personal-code-validator](https://github.com/vladislavgoltjajev/java-personal-code) package used by the intern

# IMPORTANT

#### When running the program, use back-end from this repository and front-end from [original source](https://github.com/deskrock/intern-decision-engine-frontend), but replace `intern-decision-engine-frontend/lib/widgets/loan_form.dat` with `loan_form.dat` from this repository's root to apply front-end fixes.