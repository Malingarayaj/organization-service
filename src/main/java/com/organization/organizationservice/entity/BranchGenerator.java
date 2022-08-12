package com.organization.organizationservice.entity;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.query.Query;

public class BranchGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "BRCH";
		Session newSession = (Session) session;
		try {

			String queryString = "from Branch order by branchId desc";
			Query query = newSession.createQuery(queryString);
			Branch branch = (Branch) query.setMaxResults(1).uniqueResult();

			if (branch != null) {
				int count = Integer.parseInt(branch.getBranchId().replace(prefix, ""));
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
