package com.example.rest.dao;

import java.util.List;

import com.example.rest.entity.Employee;

public interface EmployeeDao {
public List<Employee> findAll ();
public Employee findById(int id);
public Employee save(Employee employee); //insert and update
public void deleteById(int id);

}
