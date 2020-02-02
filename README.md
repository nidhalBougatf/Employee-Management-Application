# Employees Management Application 

The main purpose, of this project, is to learn how to create a full stack application using SpringBoot, Angular 8 and MongoDB.


## Development steps :


### V1.0 : Backend Development

1. Create a Spring Boot Application ( Dependencies : Web, Data MongoDB)
2. Prepare project structure (you can check the screenshots below )
3. Configuring MongoDB database :
	- Create mongoDB database named 'EmployeeDB'  
	- Add its link to application.properties	(mongo shell cmd  : use EmployeeDB)
4. Creating the Employee Model, Employee Repository and the APIs in EmployeeController
5. Exception handling in RESTFul web services
	-  ErrorDetails , ResourceNotFoundException, GlobalExceptionHandler
6. Testing REST APIs 


### V2.0 : Frontend Development

1. Create an Angular project ( Using angular CLI , for more details : https://cli.angular.io)
2. Install bootstrap 4 and JQuery ( npm install bootstrap jquery --save )
	- Note : Don't forget to configure it in angular.json file 
3. Identify Components, Services, and Modules
	-  Components:  create-employee, employee-list, employee-details, update-employee
	-  Services: employee.service.ts ( Service for Http Client methods)
	-  Modules: FormsModule, HttpClientModule, AppRoutingModule
	-  Employee Class (Typescript class)  employee.ts: class Employee (id, firstName, lastName, emailId)
4. Generate Service, Components and Employee class ,using the following commands :
	- ng g class employee
	- ng g s employee // s -> service
	- ng g c create-employee // c-> component
	- ng g c update-employee
	- ng g c employee-details
	- ng g c employee-list
	
	



	
#### Below you can find some screenshots summarizing the different features that we are working on
	
	
	
	
![EmployeesList](https://raw.githubusercontent.com/nidhalBougatf/Employee-Management-Application/master/Screenshots/EmployeesList.PNG)

![EmployeAdde](https://raw.githubusercontent.com/nidhalBougatf/Employee-Management-Application/master/Screenshots/EmployeeAdd.PNG)

![EmployeeDetails](https://raw.githubusercontent.com/nidhalBougatf/Employee-Management-Application/master/Screenshots/EmployeeDetails.PNG)

![EmployeeUpdate](https://raw.githubusercontent.com/nidhalBougatf/Employee-Management-Application/master/Screenshots/EmployeeUpdate.PNG)


#### Angular Project Structure

![AngularProjectStructure](https://raw.githubusercontent.com/nidhalBougatf/Employee-Management-Application/master/Screenshots/AngularProjectStructure.PNG)


#### SpringBoot Project Structure

![SpringBootProjectStructure](https://raw.githubusercontent.com/nidhalBougatf/Employee-Management-Application/master/Screenshots/SpringBootProjectStructure.PNG)
