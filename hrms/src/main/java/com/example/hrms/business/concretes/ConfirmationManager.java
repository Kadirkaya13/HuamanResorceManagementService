package com.example.hrms.business.concretes;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.ConfirmationService;
import com.example.hrms.business.constants.Messages;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.ConfirmationDao;
import com.example.hrms.entities.concretes.Confirmation;
@Service
public class ConfirmationManager implements ConfirmationService{

	private ConfirmationDao dao;

	public ConfirmationManager(ConfirmationDao dao) {
		super();
		this.dao = dao;
	}
	boolean bool = false;
	@Override
	public boolean isConfirmed(Boolean booltype) {
		LocalDateTime firstDate = LocalDateTime.now();
		LocalDateTime endDate = firstDate.plus(Period.ofDays(30));
		LocalDateTime today = LocalDateTime.now();
		
		if(today.getHour() >= endDate.getHour() && booltype==false) {
			
			return bool=true;
		}
		return false;
	}

	@Override
	public DataResult<List<Confirmation>> getAll() {
		return new SuccessDataResult<List<Confirmation>>(dao.findAll());
	}

	@Override
	public Result add(Confirmation confirmation) {	
		
		dao.save(confirmation);
		return new SuccessResult(Messages.employerConfirmed);
	}


}
