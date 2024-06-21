package com.assetmanagement.specsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assetmanagement.specsender.service.SystemIntfoService;

@RestController
@RequestMapping("/specSender/api/v1/")
public class SpecSenderController {
	
	
	@Autowired
	private SystemIntfoService systemIntfoService;
	
	
	 @GetMapping("/getSystemInfo")
	    public String sendSystemInfo() {
		 
		//return  systemIntfoService.getSystemDetails();
		 return null;
		 
	 }
	 
		
	 @GetMapping("/getInstalledApp")
	    public String getSystemInstallApps() {
			/* return systemIntfoService.getInstalledApplications(); */
		 
		 return null;
	 }
	
	
	

}
