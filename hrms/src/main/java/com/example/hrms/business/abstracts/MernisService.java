package com.example.hrms.business.abstracts;



public interface MernisService<T> {
	boolean identityCheck(T t,String identityNumber,String firstName,String lastName,int birthDay);
}
