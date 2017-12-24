package day56_hibernate_05_onetomany;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.loader.custom.CustomLoader.ScalarResultColumnProcessor;
import org.junit.Test;

import com.qf.entity.Customer;
import com.qf.utils.HibernateUtil;

public class HqlTest {

	/**
	 * 用HQL查询全部
	 */
	@Test
	public void testQuallAll() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("from Customer");

		List<Customer> customerList = query.list();
		for (Customer customer : customerList) {
			System.out.println(customer.getName());
		}
		transaction.commit();

	}

	/**
	 * 用HQL查询单个对象
	 */
	@Test
	public void testQuallCustomerById() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("from Customer c where c.id = 3");

		Customer customer = (Customer) query.uniqueResult();
		System.out.println(customer);
		transaction.commit();

	}

	/**
	 * 投影(只展示部分字段)
	 */
	@Test
	public void testQuallCustomerById1() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();

		// HQL里面不支持*的写法，会报语法错误
		// Query query = session.createQuery("select * from Customer c where
		// c.id = 3");

		// 1.返回一个属性用字符串去接收
		// Query query = session.createQuery("select c.name from Customer c
		// where c.id = 3");

		// 2.返回多个属性的时候用Object数组的去接收
		Query query = session.createQuery("select c.name,c.id from Customer c where c.id = 3");

		Object[] customer = (Object[]) query.uniqueResult();
		for (int i = 0; i < customer.length; i++) {
			System.out.println(customer[i]);
		}
		transaction.commit();

	}

	@Test
	public void testQuallCustomerById2() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();

		// HQL里面不支持*的写法，会报语法错误
		// 用构造器去接收
		Query query = session.createQuery("select new Customer(c.name,c.id) from Customer c where c.id = 3");

		Customer customer = (Customer) query.uniqueResult();
		System.out.println(customer);
		transaction.commit();
	}

	/**
	 * 排序
	 */
	@Test
	public void testQuallCustomerOrderBy() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("select c from Customer c order by c.id desc");

		List<Customer> list = query.list();
		for (Customer customer2 : list) {
			System.out.println(customer2.getId()+":"+customer2.getName());
		}
		transaction.commit();
	}
	
	
	/**
	 * 测试分页
	 */
	@Test
	public void testHQlPage() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("select c from Customer c order by c.id desc");
		
		// limit 1,3
		// 添加分页信息
		query.setMaxResults(3); // 显示的条数
		query.setFirstResult(0); // 起始行
		
		List<Customer> customers = query.list();
		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}
		transaction.commit();
	}
	/**
	 * 绑定参数
	 */
	@Test
	public void testSetParam() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("select c from Customer c where c.id = ?");
		query.setInteger(0, 3);
		Customer customer = (Customer)query.uniqueResult();
		System.out.println(customer);
		
		transaction.commit();
	}
	
	/**
	 * 绑定参数
	 */
	@Test
	public void testSetParam2() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("select c from Customer c where c.id = :id and c.name = :name");
		query.setInteger("id", 3);
		query.setString("name", "张三1");
		
		Customer customer = (Customer)query.uniqueResult();
		System.out.println(customer);
		
		transaction.commit();
	}
	
	/**
	 * 测试模糊查询
	 */
	@Test
	public void testSetLike() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("select c from Customer c where c.name like :name");
		query.setString("name", "%张%");
		
		List<Customer> customers = query.list();
		for (Customer customer : customers) {
			System.out.println(customer.getName());
		}
		transaction.commit();
	}
	
	
	@Test
	public void testCount() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 1.可以运行
//		Query query = session.createQuery("select count(*) from Customer");
		
		// 2.1是不行的
//		Query query = session.createQuery("select count(1) from Customer ");
		
		// 3.如果有别名count里面就写别名
		Query query = session.createQuery("select count(c) from Customer c");
		Long uniqueResult = (Long)query.uniqueResult();
		System.out.println(uniqueResult);
		transaction.commit();
	}
	
	
	/**
	 * 产生笛卡尔积
	 */
	@Test
	public void testJoin1() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Customer,OrderInfo");
		List list = query.list();
		System.out.println(list.size());
		transaction.commit();
	}
	
	/**
	 * 解决笛卡尔积
	 */
	@Test
	public void testJoin12() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Customer c,OrderInfo o where o.customer = c");
		List list = query.list();
		System.out.println(list.size());
		transaction.commit();
	}
	
	/**
	 * 分组
	 */
	@Test
	public void testGroupBy() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Customer c,OrderInfo o where o.customer = c group by c.name");
		List list = query.list();
		System.out.println(list.size());
		transaction.commit();
	}
	
	
	/**
	 * 左链接
	 */
	@Test
	public void testJoin3() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 等价于sql里面的左链接select * from t_customer c right left t_order o on (c.id = o.customer_id);
		Query query = session.createQuery("from Customer c left join fetch c.orderInfos");
		List list = query.list();
		System.out.println(list.size());
		transaction.commit();
	}

}
