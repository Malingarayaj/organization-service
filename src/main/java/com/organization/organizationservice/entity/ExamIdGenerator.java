package com.organization.organizationservice.entity;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ExamIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "EXAM";
 		Session newSession =(Session)session;
 		try {			
 		
 			String queryString = "from Exam order by examId desc";
 			Query query = newSession.createQuery(queryString);			
 			Exam exam = (Exam) query.setMaxResults(1).uniqueResult();			
             
 			if(exam!=null) {
 				int count = Integer.parseInt(exam.getExamId().replace(prefix, ""));
 				int present=count+1;
 				String code = prefix + StringUtils.leftPad("" + present, 8 ,'0');
 				return code;
 			} else	{
 				String code = prefix + StringUtils.leftPad("" + 1, 8,'0');
 				return code;
 			}

 		} catch (Exception e) {       
 			e.printStackTrace();			
 		} 
 		return null;
	}

}
