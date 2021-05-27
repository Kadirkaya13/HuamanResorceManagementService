package com.example.hrms.business.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.MernisService;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
@Service
public class MernisManager implements MernisService<Object>{
	KPSPublicSoapProxy kPSPublicSoapProxy;
	
	@Override
	public boolean identityCheck(Object t, String identityNumber, String firstName, String lastName, int birthDay) {
		
			boolean result = false;
			try {
				result = kPSPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(identityNumber) , firstName, lastName, birthDay);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return result;
	}

	

}
