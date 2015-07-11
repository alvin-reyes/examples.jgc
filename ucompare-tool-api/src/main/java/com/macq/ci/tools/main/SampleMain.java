package com.macq.ci.tools.main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.macq.ci.tools.dao.intf.RequestExecuteCompareDao;
import com.macq.ci.tools.entities.UcRequest;
import com.macq.ci.tools.entities.UcRequestOutput;

import com.macq.ci.tools.service.intf.RequestExecuteCompareService;

public class SampleMain {

	@Autowired
	private RequestExecuteCompareDao req;
	
	public SampleMain() throws Exception {
		String alvin = "Alvin String1";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/ucompare-tools-api.xml");
		context.start();
		System.out.println(context.getBeansOfType(RequestExecuteCompareDao.class));
		RequestExecuteCompareService a = (RequestExecuteCompareService)context.getBean("requestExecuteCompareService");
		UcRequest uc = new UcRequest();
		uc.setCreatedBy("hello");
		uc.setEmail("alvin.reyes@macquarie.com");
		uc.setStatus("New");
		uc.setUpdatedBy("Hello");
		uc.setSvnUrl1("http://sdlc/svn/mas_ngw/branches/badge_MPMMER/");
		//uc.setSvnUrl2("http://sdlc/svn/mas_ngw/branches/badge_MPMMER1/");
		List<UcRequestOutput> list1 = new ArrayList<UcRequestOutput>();
		
		
		UcRequestOutput ab3 = new UcRequestOutput();
		ab3.setFileName("file");
		ab3.setUcRequest(uc);

		
		list1.add(ab3);
		
		uc.setUcRequestOutput(list1);
		
		a.requestCompare(uc);
		a.getAllComparisonRequest(true);
		System.out.println(uc.getId());
		
		//System.out.println("before");
		//a.SampleAsync();
		//System.out.println("after");
		
		
		RequestExecuteCompareService b = (RequestExecuteCompareService)context.getBean("executeCompareServiceEjb");
		
		System.out.println("before ejb");
		b.SampleAsync();
		System.out.println("after ejb");
		
		
	}
	
	public static void main(String[] args) throws Exception{
		new SampleMain();
	}
}
