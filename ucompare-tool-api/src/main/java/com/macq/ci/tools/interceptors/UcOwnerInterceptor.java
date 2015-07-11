package com.macq.ci.tools.interceptors;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.macq.ci.tools.entities.UcOwner;

public class UcOwnerInterceptor extends EmptyInterceptor {

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types) {
		((UcOwner)entity).setCreatedDate(new Date());
		return true;
	}

	@Override
	public void preFlush(Iterator entities) {
		while (entities.hasNext()) {
			UcOwner ucOwner = (UcOwner) entities.next();
			ucOwner.setCreatedDate(new Date());
			ucOwner.setUpdatedDate(new Date());
			ucOwner.setUpdatedBy("citool");
			ucOwner.setCreatedBy("citool");
		}
	}
}
