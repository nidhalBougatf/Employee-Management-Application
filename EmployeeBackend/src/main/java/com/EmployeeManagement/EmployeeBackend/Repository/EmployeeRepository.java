package com.EmployeeManagement.EmployeeBackend.Repository;

import com.EmployeeManagement.EmployeeBackend.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

    /*public List<Employee> findAll();
    public Employee findById(int id);
    public Employee save (Employee employee);*/




}