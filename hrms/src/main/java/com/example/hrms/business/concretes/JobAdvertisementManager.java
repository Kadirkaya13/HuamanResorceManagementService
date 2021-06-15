package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.example.hrms.entities.concretes.JobAdvertisement;
@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	JobAdvertisementDao jobAdvertisementDao;
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult();
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult();
	}

	@Override
	public Result delete(JobAdvertisement jobAdvertisement) {
		jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC, "releaseDate");
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll(sort));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive( ) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.getByIsActive(true));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_CompanyName(boolean status, String companyName) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.getByIsActiveAndEmployer_CompanyName(status, companyName));
	}

	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		
		return new SuccessDataResult<JobAdvertisement>(jobAdvertisementDao.getById(id));
	}

}
