package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.ErrorResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobSeekerDao;
import com.example.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	JobSeekerDao jobSeekerDao;
	EmailVerificationService emailVerificationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,EmailVerificationService emailVerificationService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.emailVerificationService=emailVerificationService;
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult();
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		jobSeekerDao.save(jobSeeker);
		return new SuccessResult();
	}

	@Override
	public Result delete(JobSeeker jobSeeker) {
		jobSeekerDao.deleteById(jobSeeker.getId());
		return new SuccessResult();
		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>( jobSeekerDao.findAll());
	}

	@Override
	public Result login(JobSeeker jobSeeker) {
		return new SuccessResult("giriş yapıldı");
	}

	@Override
	public Result register(JobSeeker jobSeeker) {
		List<JobSeeker> jobSeekers= this.jobSeekerDao.findAll();
		if (checkIfUserExistsBefore(jobSeekers, jobSeeker).isSuccess()) {
			jobSeekerDao.save(jobSeeker);
			this.emailVerificationService.send(jobSeeker.getUser().getEmail());
			return new SuccessResult("Kayıt oluşturuldu");
		}
		return new ErrorResult("Bu bilgiler zaten mevcut");
	}
	private Result checkIfUserExistsBefore(List<JobSeeker> jobSeekers, JobSeeker jobSeeker){
        for (JobSeeker jobSeekerCheck: jobSeekers) {
            if (jobSeekerCheck.getUser().getEmail().equals(jobSeeker.getUser().getEmail())){
                return new ErrorResult("Bu email mevcut.");
            }	          
        }
        return new SuccessResult();
    }

}
