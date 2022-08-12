package com.organization.organizationservice.entity;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.query.Query;
import org.apache.commons.lang3.StringUtils;

public class StudentIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "SDT";
		Session newSession =(Session)session;
		try {

		String queryString = "from Student order by studentId desc";
		Query query = newSession.createQuery(queryString);
		Student student = (Student) query.setMaxResults(1).uniqueResult();
		           
		if(student!=null) {
		int count = Integer.parseInt(student.getStudentId().replace(prefix, ""));
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
