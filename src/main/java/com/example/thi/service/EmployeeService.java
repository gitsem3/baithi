package com.example.thi.service;

import com.example.thi.model.Employees;

import java.util.List;

public interface EmployeeService {
    public void save(Employees employees);
    public void delete(Integer id);
    public Employees findById(Integer id);
    public List<Employees> findAll();
    public List<Employees> findAllByNameContainsIgnoreCase(String name);
}