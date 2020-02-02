package com.EmployeeManagement.EmployeeBackend.Controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.EmployeeManagement.EmployeeBackend.Exception.ResourceNotFoundException;
import com.EmployeeManagement.EmployeeBackend.Model.Employee;
import com.EmployeeManagement.EmployeeBackend.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200") //To enable CORS on the server
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @GetMapping("/employees")
    public List <Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    @GetMapping("/employees/{id}")
    public ResponseEntity < Employee > getEmployeeById(@PathVariable(value="id") Long id) throws ResourceNotFoundException
    {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id = " + id));
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/employees")
    public void addEmployee(@Valid @RequestBody Employee employee)
    {
        employee.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
        employeeRepository.save(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity < Employee > updateEmployee(@PathVariable(value = "id") Long id,
                                                      @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));

        employee.setEmailId(employeeDetails.getEmailId());
        employee.setLastName(employeeDetails.getLastName());
        employee.setFirstName(employeeDetails.getFirstName());
        final Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/employees/{id}")
    public Map < String, Boolean >  deleteEmployee(@PathVariable(value="id") Long id)  throws ResourceNotFoundException
    {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
        employeeRepository.delete(employee);
        Map<String,Boolean> response = new HashMap <> ();
        response.put("deleted", Boolean.TRUE);
        return response;
    }




}