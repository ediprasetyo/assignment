package com.javahelps.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.T2_employee;
import com.javahelps.restservice.repository.EmployeeRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping
    public Iterable<T2_employee> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public T2_employee find(@PathVariable("id") Long id) {
        return repository.findOne(id);
    }

    @PostMapping(consumes = "application/json")
    public T2_employee create(@RequestBody T2_employee employee) {
        return repository.save(employee);
    }

    @PutMapping(path = "/delete/{id}")
    public T2_employee delete(@PathVariable("id") Long id, @RequestBody T2_employee employee) {
        if (repository.exists(id)) {
            employee.setId(id);
            employee.setIs_delete(1);
            return repository.save(employee);
        }
		return employee;
    }
    
    @PutMapping(path = "/{id}")
    public T2_employee update(@PathVariable("id") Long id, @RequestBody T2_employee employee) {
        if (repository.exists(id)) {
            employee.setId(id);
            employee.setIs_delete(0);
            return repository.save(employee);
        }
		return employee;
    }
    

}