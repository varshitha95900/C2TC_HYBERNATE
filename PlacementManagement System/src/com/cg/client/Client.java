package com.cg.client;

import com.cg.entities.College;
import com.cg.services.CollegeService;
import com.cg.services.CollegeServiceImpl;

public class Client {

	public static void main(String[] args) {
CollegeService service2= new CollegeServiceImpl();
		
		College college = new College();
		college.setCollegeName("SIET");
		college.setId(2);
		college.setLocation("Tumkur");
		service2.addCollege(college);

	}

}
