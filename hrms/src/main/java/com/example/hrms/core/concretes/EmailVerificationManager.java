package com.example.hrms.core.concretes;



import org.springframework.stereotype.Service;

import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessResult;


@Service
public class EmailVerificationManager implements EmailVerificationService  {

	@Override
	public Result send(String email) {
		return new SuccessResult(email + " Adresine mail gönderildi");
	}

}
