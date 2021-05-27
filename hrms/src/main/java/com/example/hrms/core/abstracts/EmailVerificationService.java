package com.example.hrms.core.abstracts;

import com.example.hrms.core.results.Result;

public interface EmailVerificationService {
	public Result send(String email) ;
}
