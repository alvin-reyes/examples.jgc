package com.macq.ci.tools.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.Transactional;

import com.macq.ci.tools.dao.intf.RequestExecuteCompareDao;
import com.macq.ci.tools.entities.UcRequest;
import com.macq.ci.tools.exceptions.DaoException;
import com.macq.ci.tools.exceptions.ServiceException;
import com.macq.ci.tools.service.intf.RequestExecuteCompareService;

@Named("executeCompareServiceEjb")
@EnableAsync
public class RequestExecuteCompareServiceEjbImpl extends BaseService implements RequestExecuteCompareService {
	
	@Inject
	@Qualifier("executeCompareDao")
	private RequestExecuteCompareDao requestExecuteCompareDao;
	
	@Transactional
	public UcRequest requestCompare(UcRequest ucRequest)
			throws ServiceException {
		String sample = "";
		try {
			requestExecuteCompareDao.requestCompare(ucRequest);
		}catch(DaoException e) {
			e.printStackTrace();
		}
		return ucRequest;
	}
	
	@Transactional(readOnly=true)
	public List<UcRequest> getAllComparisonRequest(boolean activeOnly)
			throws ServiceException {
		try {
			//	morph the ucRequest object here.
			return requestExecuteCompareDao.getAllComparisonRequest(activeOnly);
		}catch(DaoException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Transactional
	public UcRequest updateComparisonRequest(UcRequest ucRequest)
			throws ServiceException {
		try {
			requestExecuteCompareDao.updateComparisonRequest(ucRequest);
		}catch(DaoException e) {
			e.printStackTrace();
		}
		return ucRequest;
	}
	
	@Async
	public void SampleAsync() {
		for(int i=0;i<50;i++) {
			System.out.println("hello async!");
		}
	}
}
