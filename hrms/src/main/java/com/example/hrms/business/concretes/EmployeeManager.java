package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.ErrorResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.EmployeeDao;
import com.example.hrms.entities.concretes.Employee;
import com.example.hrms.entities.concretes.Employer;

@Service
public class EmployeeManager implements EmployeeService{

	EmployeeDao employeeDao;
	EmailVerificationService emailVerificationService;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao,EmailVerificationService emailVerificationService) {
		super();
		this.employeeDao = employeeDao;
		this.emailVerificationService=emailVerificationService;
	}

	
	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll());
	}


	@Override
	public Result login(Employee employee) {
		return new SuccessResult("giriş yapıldı");
	}

	@Override
	public Result register(Employee employee) {
		List<Employee>employees= this.employeeDao.findAll();
		if (checkIfUserExistsBefore(employees, employee).isSuccess()) {
			employeeDao.save(employee);
			this.emailVerificationService.send(employee.getUser().getEmail());
			return new SuccessResult("Kayıt oluşturuldu");
		}
		return new ErrorResult("Bu bilgiler zaten mevcut");
	}
	private Result checkIfUserExistsBefore(List<Employee> employees,Employee employee){
        for (Employee employeesCheck: employees) {
            if (employeesCheck.getUser().getEmail().equals(employee.getUser().getEmail())){
                return new ErrorResult("Bu email mevcut.");
            }	          
        }
        return new SuccessResult();
    }

}
