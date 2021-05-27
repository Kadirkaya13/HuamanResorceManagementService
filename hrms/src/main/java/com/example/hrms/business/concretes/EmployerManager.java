package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.ErrorResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;
import com.example.hrms.entities.concretes.JobSeeker;
@Service
public class EmployerManager implements EmployerService {

	EmployerDao  employerDao;
	EmailVerificationService emailVerificationService;
	@Autowired
	public EmployerManager(EmployerDao employerDao,EmailVerificationService emailVerificationService) {
		super();
		this.employerDao = employerDao;
		this.emailVerificationService=emailVerificationService;
	}

	@Override
	public Result add(Employer employer) {
		employerDao.save(employer);
		return new SuccessResult();
	}

	@Override
	public Result update(Employer employer) {
		employerDao.save(employer);
		return new SuccessResult();
		
	}

	@Override
	public Result delete(Employer employer) {
		employerDao.deleteById(employer.getId());
		return new SuccessResult();
		
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(employerDao.findAll());
	}

	@Override
	public Result login(Employer employer) {
		return new SuccessResult("giriş yapıldı");
	}

	@Override
	public Result register(Employer employer) {
		List<Employer>employers= this.employerDao.findAll();
		if (checkIfUserExistsBefore(employers, employer).isSuccess()) {
			employerDao.save(employer);
			this.emailVerificationService.send(employer.getUser().getEmail());
			return new SuccessResult("Kayıt oluşturuldu");
		}
		return new ErrorResult("Bu bilgiler zaten mevcut");
	}
	private Result checkIfUserExistsBefore(List<Employer> employers,Employer employer){
        for (Employer employerCheck: employers) {
            if (employerCheck.getUser().getEmail().equals(employer.getUser().getEmail())){
                return new ErrorResult("Bu email mevcut.");
            }	          
        }
        return new SuccessResult();
    }

}
