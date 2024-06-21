package com.assetmanagement.specsender.service;

import com.assetmanagement.specsender.dto.SystemSpecfication;


public interface SystemIntfoService {
	
	public SystemSpecfication getSystemDetails();
	
	public void  getInstalledApplications();
	
	

	void sendSpecification();

}
