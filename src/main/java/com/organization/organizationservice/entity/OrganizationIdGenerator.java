package com.organization.organizationservice.entity;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.query.Query;

public class OrganizationIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "ORG";
		Session newSession = (Session) session;
		try {

			String queryString = "from Organization order by orgId desc";
			Query query = newSession.createQuery(queryString);
			Organization org = (Organization) query.setMaxResults(1).uniqueResult();

			if (org != null) {
				int count = Integer.parseInt(org.getOrgId().replace(prefix, ""));
				int present = count + 1;
				String code = prefix + StringUtils.leftPad("" + present, 7, '0');
				return code;
			} else {
				String code = prefix + StringUtils.leftPad("" + 1, 7, '0');
				return code;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
