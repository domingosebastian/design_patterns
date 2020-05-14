Our application allows us to manage the registration for wrestling tournaments and tennis tournament.

The two main classes are FightRegistration and TennisRegistration

Both classes have a similar structure:

- the main method is register(request) that returns a boolean indicating whether or not someone has been able to register.
- the structure of the method is:
    - Performs a series of validations to determine if the applicant meets the requirements
    - Check if there are still places available
    - If both of these are possible, they applicant is signed up to the tournament
    - If the maximum number of applicants is reached, confirm the tournament (for now only reserve the sports center,
      although this would be expanded in the future)
      
  You have a test to verify that your refactorings do not ruin the logic.
 
  How could you apply the template pattern to avoid duplication in the code?
