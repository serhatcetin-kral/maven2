package hiber01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Runeer01 {

	
	public static void main(String[] args) {
		
		Teachers01 tc=new Teachers01();
		tc.setId(1001);
		tc.setName("murat");
		tc.setSubject("math");
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teachers01.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr=session.beginTransaction();
		
		session.save(tc);
		tr.commit();
	}
	
}
