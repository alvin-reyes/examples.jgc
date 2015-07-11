package com.macq.ci.tools.dao.intf;

import java.util.List;
import com.macq.ci.tools.entities.UcRequest;
import com.macq.ci.tools.exceptions.DaoException;

public interface RequestExecuteCompareDao {
	
	public UcRequest updateComparisonRequest(UcRequest ucRequest) throws DaoException;

	public UcRequest requestCompare(UcRequest ucRequest) throws DaoException;

	public List<UcRequest> getAllComparisonRequest(boolean activeOnly)
			throws DaoException;

}
