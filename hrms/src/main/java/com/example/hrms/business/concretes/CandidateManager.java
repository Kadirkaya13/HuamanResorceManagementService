package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.CandidateService;
import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.ErrorResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.CandidateDao;
import com.example.hrms.entities.concretes.Candidate;
import com.example.hrms.entities.dtos.CandidateResumeDto;


@Service
public class CandidateManager implements CandidateService{

	CandidateDao candidateDao;
	EmailVerificationService emailVerificationService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao,EmailVerificationService emailVerificationService) {
		super();
		this.candidateDao = candidateDao;
		this.emailVerificationService=emailVerificationService;
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult();
	}

	@Override
	public Result update(Candidate candidate) {
		candidateDao.save(candidate);
		return new SuccessResult();
	}

	@Override
	public Result delete(Candidate candidate) {
		candidateDao.deleteById(candidate.getId());
		return new SuccessResult();
		
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>( candidateDao.findAll());
	}

	@Override
	public Result login(Candidate candidate) {
		return new SuccessResult("giriş yapıldı");
	}

	@Override
	public Result register(Candidate candidate) {
		List<Candidate> condidates= this.candidateDao.findAll();
		if (checkIfUserExistsBefore(condidates, candidate).isSuccess()) {
			candidateDao.save(candidate);
			this.emailVerificationService.send(candidate.getUser().getEmail());
			return new SuccessResult("Kayıt oluşturuldu");
		}
		return new ErrorResult("Bu bilgiler zaten mevcut");
	}
	private Result checkIfUserExistsBefore(List<Candidate> condidates, Candidate candidate){
        for (Candidate condidateCheck: condidates) {
            if (condidateCheck.getUser().getEmail().equals(candidate.getUser().getEmail())){
                return new ErrorResult("Bu email mevcut.");
            }	          
        }
        return new SuccessResult();
    }

//	@Override
//	public DataResult<List<Candidate>> getAllSortedTime() {
//		
//		
//		Sort sort = Sort.by(Sort.Direction.DESC,"");
//		
//		return new SuccessDataResult<List<Candidate>>(this.jobSeekerDao.findAll(sort),"Data listelendi");
//	}

//	@Override
//	public DataResult<List<CandidateResumeDto>> getCandidateWithCv(int condidateId) {
//		
//		return new SuccessDataResult<List<CandidateResumeDto>>(this.candidateDao.getCandidate(condidateId));
//	}

}
