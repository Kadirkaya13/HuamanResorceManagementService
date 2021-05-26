package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.MernisService;
import com.example.hrms.dataAccess.abstracts.MernisDao;
import com.example.hrms.entities.concretes.Mernis;
@Service
public class MernisManager implements MernisService{
	MernisDao mernisDao;
	@Autowired
	public MernisManager(MernisDao mernisDao) {
		super();
		this.mernisDao = mernisDao;
	}

	@Override
	public void add(Mernis mernis) {
		mernisDao.save(mernis);
		
	}

	@Override
	public void update(Mernis mernis) {
		mernisDao.save(mernis);
		
	}

	@Override
	public void delete(Mernis mernis) {
		mernisDao.deleteById(mernis.getId());
		
	}

	@Override
	public List<Mernis> getAll() {
		
		return mernisDao.findAll();
	}

}
