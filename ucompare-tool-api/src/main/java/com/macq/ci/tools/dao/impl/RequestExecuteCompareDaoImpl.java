package com.macq.ci.tools.dao.impl;

import java.util.List;

import javax.inject.Named;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.macq.ci.tools.dao.BaseDao;
import com.macq.ci.tools.dao.intf.RequestExecuteCompareDao;
import com.macq.ci.tools.entities.UcRequest;
import com.macq.ci.tools.exceptions.DaoException;

@Named("executeCompareDao")
@Repository
public class RequestExecuteCompareDaoImpl extends BaseDao implements
		RequestExecuteCompareDao {

	private static String GET_ALL_COMP_REQ = " From UcRequest as ucReq";
	
	public List<UcRequest> getAllComparisonRequest(boolean activeOnly)
			throws DaoException {
		Session sess = this.getSession();
		String activeOnlyFlag = "";
		if(activeOnly) {
			activeOnlyFlag = activeOnlyFlag + " where ucReq.status = 'New'";
		}
		
		try {			
			Query query = sess.createQuery(GET_ALL_COMP_REQ + activeOnlyFlag);
			
			List<UcRequest> ucRequestList = (List<UcRequest>) query.list();
			if (ucRequestList.size() == 0) {
				return null;
			}
			
			return ucRequestList;
		}catch(HibernateException he) {
			throw new DaoException();
		}
	}

	public UcRequest requestCompare(UcRequest ucRequest) throws DaoException {
		Session sess = this.getSession();
		try {
			sess.save(ucRequest);
			sess.flush();
		} catch (Exception e) {
			e.printStackTrace();
			sess.close();
		}
		return ucRequest;
	}
	
	public UcRequest updateComparisonRequest(UcRequest ucRequest)
			throws DaoException {
		Session sess = this.getSession();
		try {
			sess.update(ucRequest);
			sess.flush();
		} catch (Exception e) {
			e.printStackTrace();
			sess.close();
		}
		return ucRequest;
	}
}
