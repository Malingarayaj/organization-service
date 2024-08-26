package com.organization.organizationservice.entity;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.query.Query;

public class UserIdGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "USR";
		Session newSession =(Session)session;
		try {

		String queryString = "from User order by userId desc";
		Query query = newSession.createQuery(queryString);
		User lastDevice = (User) query.setMaxResults(1).uniqueResult();
		           
		if(lastDevice!=null) {
		int count = Integer.parseInt(lastDevice.getUserId().replace(prefix, ""));
		int present=count+1;
		String code = prefix + StringUtils.leftPad("" + present, 8 ,'0');
		return code;
		} else {
		String code = prefix + StringUtils.leftPad("" + 1, 8,'0');
		return code;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
