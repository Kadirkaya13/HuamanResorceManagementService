package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.dataAccess.abstracts.EmployeeDao;
import com.example.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public void add(Employee employee) {
		employeeDao.save(employee);
		
	}

	@Override
	public void update(Employee employee) {
		employeeDao.save(employee);
		
	}

	@Override
	public void delete(Employee employee) {
		employeeDao.deleteById(employee.getId());
		
	}

	@Override
	public List<Employee> getAll() {
		
		return employeeDao.findAll();
	}

}
