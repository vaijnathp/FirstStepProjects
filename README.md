### Project details
This project helps to create the basics/first setup projects for the different framework

**Apache:**
  - Spark SQL
**Azure:**
  - Function App
  
### Code Review Guidlines
Here are few points that can be part of the review process in most of the framework we are working in different projects.

**General:**
1.	Use of naming conventions and Project Structuring.

**ADF:**
1.	Need to mask the secrets by storing in key vault and use the secret’s name instead of value.
2.	Use of variable parameters in all the places possible in pipelines
3.	Use of folder hierarchy to organize the pipelines
4.	Trigger must be deactivated before the committing in the repository 
5.	Avoid having many parameters by combining the related parameters into one e.g. in JSON format

**Event/ IoT hub:**
1.	Use your own consumer group to avoid loss of data.

**DataBricks:**
1.	Must follow the coding standard
    a.	Avoid comments code people often forget to update it in case of changes
    b.	Give descriptive names to local functions and generic names to global functions.
    c.	Avoid writing lengthy Functions (Function body must be as small as possible)
    d.	Use Tail recursion instead of normal recursion.
    e.	Try to use as less global variable as possible.
    f.	Write specific to code try catch blocks.
    g.	One must Use design patterns to establish proper dependencies between code.
    h.  Logging must be in place and use different level of logs for logging details.
2.	Must create and use the reusable modules.
3.	Use single responsibility principle for notebook creation.
4.	Use java reflection like concept in class instantiation instead of the ‘if else’ statement.
5.	Must have Unit Test case.

**Function App:**
1.	Use masking while keeping Secrets in environment variable (use KeyVault).
2.	Use modules instead of writing whole logic into single file.
	
**Code Versioning:**
1.	Use of proper commit message.
2.	Avoid having multiple of commits for a feature (use Squash commits).
3.	Only merge in case of artefact is working independently even if it is partially developed.
	

