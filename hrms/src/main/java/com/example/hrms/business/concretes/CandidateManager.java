package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.CandidateService;
import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.ErrorResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.CandidateDao;
import com.example.hrms.entities.concretes.Candidates;

@Service
public class CandidateManager implements CandidateService{

	CandidateDao jobSeekerDao;
	EmailVerificationService emailVerificationService;
	
	@Autowired
	public CandidateManager(CandidateDao jobSeekerDao,EmailVerificationService emailVerificationService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.emailVerificationService=emailVerificationService;
	}

	@Override
	public Result add(Candidates jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult();
	}

	@Override
	public Result update(Candidates jobSeeker) {
		jobSeekerDao.save(jobSeeker);
		return new SuccessResult();
	}

	@Override
	public Result delete(Candidates jobSeeker) {
		jobSeekerDao.deleteById(jobSeeker.getId());
		return new SuccessResult();
		
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		
		return new SuccessDataResult<List<Candidates>>( jobSeekerDao.findAll());
	}

	@Override
	public Result login(Candidates jobSeeker) {
		return new SuccessResult("giriş yapıldı");
	}

	@Override
	public Result register(Candidates jobSeeker) {
		List<Candidates> jobSeekers= this.jobSeekerDao.findAll();
		if (checkIfUserExistsBefore(jobSeekers, jobSeeker).isSuccess()) {
			jobSeekerDao.save(jobSeeker);
			this.emailVerificationService.send(jobSeeker.getUser().getEmail());
			return new SuccessResult("Kayıt oluşturuldu");
		}
		return new ErrorResult("Bu bilgiler zaten mevcut");
	}
	private Result checkIfUserExistsBefore(List<Candidates> jobSeekers, Candidates jobSeeker){
        for (Candidates jobSeekerCheck: jobSeekers) {
            if (jobSeekerCheck.getUser().getEmail().equals(jobSeeker.getUser().getEmail())){
                return new ErrorResult("Bu email mevcut.");
            }	          
        }
        return new SuccessResult();
    }

}
