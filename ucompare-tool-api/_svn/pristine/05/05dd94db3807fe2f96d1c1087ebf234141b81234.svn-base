package com.macq.ci.tools.main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.macq.ci.tools.dao.impl.RequestExecuteCompareDaoImpl;
import com.macq.ci.tools.dao.impl.RequestExecuteCompareJDBCDaoImpl;
import com.macq.ci.tools.dao.intf.RequestExecuteCompareDao;
import com.macq.ci.tools.entities.UcRequest;
import com.macq.ci.tools.entities.UcRequestOutput;
import com.macq.ci.tools.service.impl.RequestExecuteCompareJDBCServiceImpl;
import com.macq.ci.tools.service.intf.RequestExecuteCompareService;

public class SampleMainJDBC {

	@Autowired
	private RequestExecuteCompareDao req;
	
	public SampleMainJDBC() throws Exception {
		
		RequestExecuteCompareService requestService = new RequestExecuteCompareJDBCServiceImpl();
		requestService.getAllComparisonRequest(true);
		
		UcRequest uc = new UcRequest();
		uc.setCreatedBy("hello");
		uc.setEmail("alvin.reyes@macquarie.com");
		uc.setStatus("New");
		uc.setUpdatedBy("Hello");
		uc.setSvnUrl1("http://sdlc/svn/mas_ngw/branches/badge_MPMMER/wrap-ng-online");
		uc.setSvnUrl2("http://sdlc/svn/mas_ngw/branches/badge_MPMMER1/wrap-ng-online");
		
		List<UcRequestOutput> list1 = new ArrayList<UcRequestOutput>();
		
		UcRequestOutput ab3 = new UcRequestOutput();
		ab3.setFileName("file");
		ab3.setUcRequest(uc);
		
		list1.add(ab3);
		
		uc.setUcRequestOutput(list1);
		
		requestService.requestCompare(uc);
		requestService.updateComparisonRequest(uc);
		
		System.out.print(uc.getId());
		
	
	}
	
	public static void main(String[] args) throws Exception{
		new SampleMainJDBC();
	}
}
