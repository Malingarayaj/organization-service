//package com.organization.organizationservice.entity;
//
//import java.io.Serializable;
//
//import org.apache.commons.lang3.StringUtils;
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.engine.spi.SharedSessionContractImplementor;
//import org.hibernate.id.IdentifierGenerator;
//import org.hibernate.query.Query;
//
//public class VehicleIdGenerator implements IdentifierGenerator{
//	
//	@Override
//	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
//
//		String prefix = "V";
//		Session newSession =(Session)session;
//		try {			
//		
//			String queryString = "from Vehicle order by vehicleId desc";
//			Query query = newSession.createQuery(queryString);			
//		//	Vehicle vehicle = (Vehicle) query.setMaxResults(1).uniqueResult();			
//            Vehicle vehicle=(Vehicle)query.setMaxResults(1).uniqueResult();
//			if(vehicle!=null) {
//				int count = Integer.parseInt(vehicle.getVehicleId().replace(prefix, ""));
//				int present=count+1;
//				String code = prefix + StringUtils.leftPad("" + present, 7 ,'0');			
//				return code;
//			} else	{
//				String code = prefix + StringUtils.leftPad("" + 1, 7,'0');				
//				return code;
//			}
//
//		} catch (Exception e) {       
//			e.printStackTrace();			
//		} 
//		return null;
//	}
//}
