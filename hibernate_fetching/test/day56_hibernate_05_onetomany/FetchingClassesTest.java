package day56_hibernate_05_onetomany;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.type.CustomCollectionType;
import org.junit.Test;

import com.qf.entity.Customer;
import com.qf.entity.OrderInfo;
import com.qf.utils.HibernateUtil;

/**
 * 演示类级别的检索
 * @author admin
 *
 */
public class FetchingClassesTest {

	/**
	 * laod的懒惰的额机制可以手动修改，在配置文件加入lazy=false
	 */
	@Test
	public void test() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session= sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Customer customer = (Customer)session.load(Customer.class, 7);
		System.out.println("id:"+customer.getId());
		System.out.println("==================================");
		System.out.println("name:"+customer.getName());
		
		Set<OrderInfo> orderInfos = customer.getOrderInfos();
		
		transaction.commit();
		
	}
	
	/**
	 * 查询一个集合
	 */
	@Test
	public void testQueryCutomerList() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session= sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// hql,hql是面向对象的的一种写法
		Query query = session.createQuery("from Customer"); 
		
		List<Customer> customerList= query.list(); // 查询结果集
		
		for (Customer customer : customerList) {
			System.out.println(customer.getName());
		}
		
		transaction.commit();
		
	}
	
	/**
	 * 演示批量查询
	 */
	@Test
	public void testBatchQuery() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session= sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// hql,hql是面向对象的的一种写法
		Query query = session.createQuery("from Customer"); 
		
		List<Customer> customerList= query.list(); // 查询结果集
		
		for (Customer customer : customerList) {
			System.out.println(customer.getName()+":"+customer.getOrderInfos().size());
		}
		transaction.commit();
	}

	@Test
	public void testQuery(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Customer customer = (Customer)session.get(Customer.class, 3);
		System.out.println("==================================");
		System.out.println(customer.getName()+":"+customer.getOrderInfos().size());
		
		transaction.commit();
	}
	
	/**
	 * 演示select和subselect的区别
	 */
	@Test
	public void testQuery1(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("FROM Customer where id = 3");
		
		List<Customer> customers = query.list();
		for (Customer customer : customers) {
			System.out.println(customer.getName());
		}
		
		transaction.commit();
	}
	
}
