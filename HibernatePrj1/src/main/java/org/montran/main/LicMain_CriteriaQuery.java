package org.montran.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.montran.model.Lic;
import org.montran.util.SessionFactoryUtil;

public class LicMain_CriteriaQuery {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryUtil.mySessionFactory();
		Session session = factory.openSession();

		Criteria createCriteria = session.createCriteria("org.montran.model.Lic");
		
		List<Lic> list = createCriteria.list();

		System.out.println("using criteria");
		
		list.forEach(a->System.out.println(a.getLicId()+"  "+a.getLicPolicyName()+"  "+a.getLicPolicyCost()));

		createCriteria.setMaxResults(2);
		System.out.println("using 2 result ");
		
		createCriteria.list().forEach(System.out::println);
		
	//	createCriteria.add(Restrictions.like("licPolicyName", "jeevan anand"));
//		createCriteria.add(Restrictions.like("licPolicyName", "%anand"));
		createCriteria.add(Restrictions.like("licPolicyName", "jeevan%"));
		
		System.out.println("restriction like ");
		createCriteria.list().forEach(System.out::println);
		
		Criteria createCriteria1 = session.createCriteria("org.montran.model.Lic");
		
		createCriteria1.add(Restrictions.in("licId", new Integer[] {1,3,4}));
		System.out.println("restriction  in  ");
		createCriteria1.list().forEach(System.out::println);
		
		Criteria createCriteria2 = session.createCriteria("org.montran.model.Lic");
		createCriteria2.addOrder(Order.desc("licId"));
		
		System.out.println("creiteria by descending order by licId  ");
		createCriteria2.list().forEach(System.out::println);
		
		System.out.println("aggregate functions ");
		Criteria createCriteria3 = session.createCriteria("org.montran.model.Lic");
		createCriteria3.setProjection(Projections.countDistinct("licId"));
	
		System.out.println("count distinct");
		createCriteria3.list().forEach(System.out::println);
	
		Criteria createCriteria4 = session.createCriteria("org.montran.model.Lic");
		
		createCriteria4.setProjection(Projections.sum("licPolicyCost"));
		System.out.println("sum of licPolicyCost");
		createCriteria4.list().forEach(System.out::println);
		
		createCriteria4.setProjection(Projections.max("licPolicyCost"));
		System.out.println("max salary");
		createCriteria4.list().forEach(System.out::println);
		
		createCriteria4.setProjection(Projections.avg("licPolicyCost"));
		System.out.println("average salary");
		createCriteria4.list().forEach(System.out::println);
		
		createCriteria4.setProjection(Projections.min("licPolicyCost"));
		System.out.println("min salary");
		createCriteria4.list().forEach(System.out::println);
				
		createCriteria4.setProjection(Projections.rowCount());
		System.out.println("row count");
		createCriteria4.list().forEach(System.out::println);
		
		
		
		session.close();
		factory.close();
		
	}
}
