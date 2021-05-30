package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.Confirmation;

public interface ConfirmationService {
	DataResult<List<Confirmation>> getAll();
	Result add(Confirmation confirmation);
	boolean isConfirmed(Boolean booltype);
}
