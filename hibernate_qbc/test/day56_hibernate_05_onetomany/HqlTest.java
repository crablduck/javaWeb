package day56_hibernate_05_onetomany;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.loader.custom.CustomLoader.ScalarResultColumnProcessor;
import org.junit.Test;

import com.qf.entity.Customer;
import com.qf.utils.HibernateUtil;

public class HqlTest {

	/**
	 * 用QBC查询全部
	 */
	@Test
	public void testQuallAll() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Customer.class);
		
		List<Customer> customers= criteria.list();
		for (Customer customer : customers) {
			System.out.println(customer.getName());
		}
		
		System.out.println(Customer.class); // 返回的是一个对象，不是一个字符串
		
		transaction.commit();

	}
	

	/**
	 * 演示条件查询
	 */
	@Test
	public void testQuallById() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Customer.class);
		
		// 添加查询条件，可以添加多个查询条件
		criteria.add(Restrictions.eq("name", "张三"));
		criteria.add(Restrictions.eq("id", 1)); // 
		
		// 如果是一个单个对象的查询要用uniqueResult
		Customer customer = (Customer)criteria.uniqueResult(); 
		System.out.println(customer.getName());
		
		transaction.commit();
	}
	
	/**
	 * 测试分页
	 */
	@Test
	public void testPage() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Customer.class);
		// 添加分页信息
		criteria.setMaxResults(3);// 显示的条数
		criteria.setFirstResult(0);// 起始行数，从0开始
		
		List<Customer> customers= criteria.list();
		for (Customer customer : customers) {
			System.out.println(customer.getName());
		}
		transaction.commit();
	}
	
	/**
	 * 测试排序
	 */
	@Test
	public void testOrderBy() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Customer.class);
		// 添加排序规则
		criteria.addOrder(Order.desc("id"));
		
		List<Customer> customers= criteria.list();
		for (Customer customer : customers) {
			System.out.println(customer.getId()+":"+customer.getName());
		}
		transaction.commit();
	}
	
	
	@Test
	public void testLike() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Customer.class);
		
		// 模糊查询
		criteria.add(Restrictions.gt("id", 1));
		criteria.add(Restrictions.like("name", "张%"));
		
//		criteria.add(Restrictions.eq("id", 1));
		
		List<Customer> customers= criteria.list();
		for (Customer customer : customers) {
			System.out.println(customer.getId()+":"+customer.getName());
		}
		transaction.commit();
	}
	
	/**
	 * 离线查询
	 */
	@Test
	public void testLine() {
		
		// 1.现在没有获取session之前就把查询条件组装好了
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
		detachedCriteria.add(Restrictions.like("name", "张%"));
		detachedCriteria.add(Restrictions.gt("id", 1));
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 2.获取到session后直接把查询条件给它就ok，可以减少session和数据库的会话时间
		Criteria criteria = detachedCriteria.getExecutableCriteria(session);
		
		List<Customer> customers= criteria.list();
		for (Customer customer : customers) {
			System.out.println(customer.getId()+":"+customer.getName());
		}
		transaction.commit();
	}
}
