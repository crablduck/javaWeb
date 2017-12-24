package day56_hibernate_05_onetomany;

import static org.junit.Assert.*;

import java.lang.annotation.Target;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Test;

import com.qf.entity.Customer;
import com.qf.entity.OrderInfo;
import com.qf.utils.HibernateUtil;

public class CustomerTest {

	/**
	 * 第一个版本，多发了两条更新语句
	 * 	原因是外键维护全默认在一的一方，所以那两条更新语句是由一的一方发送的
	 */
	@Test
	public void testAdd() {
		
		// 创建一的一方
		Customer customer =new Customer();
		customer.setName("张三");
		
		// 创建多的一方
		OrderInfo o1 = new OrderInfo();
		o1.setOrderName("订单1");
		
		OrderInfo o2 = new OrderInfo();
		o2.setOrderName("订单2");
		
		
		// 建立关系
		// 一个客户有两个订单
		customer.getOrderInfos().add(o1);
		customer.getOrderInfos().add(o2);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 保存数据
		session.save(customer);
		session.save(o1);
		session.save(o2);
		
		transaction.commit();
		
		
	}
	
	
	/**
	 * 第二个版本，正常了
	 *  1.inverse="true",维护外键的权限交给了多的一方
	 *  2.它们之间的关系建立在多的一方
	 */
	@Test
	public void testAdd2() {
		
		// 创建一的一方
		Customer customer =new Customer();
		customer.setName("张三");
		
		// 创建多的一方
		OrderInfo o1 = new OrderInfo();
		o1.setOrderName("订单1");
		
		OrderInfo o2 = new OrderInfo();
		o2.setOrderName("订单2");
		
		
		// 建立关系
		// 一个客户有两个订单
//		customer.getOrderInfos().add(o1);
//		customer.getOrderInfos().add(o2);
		
		// 订单是属于一个客户
		o1.setCustomer(customer);
		o2.setCustomer(customer);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 保存数据
		session.save(customer);
		session.save(o1);
		session.save(o2);
		
		transaction.commit();
		
	}

	@Test
	public void testQueryCustomer(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Customer customer = (Customer)session.get(Customer.class, 4);
		System.out.println(customer.getName());
		
		Set<OrderInfo> orderInfos = customer.getOrderInfos();
		for (OrderInfo orderInfo : orderInfos) {
			System.out.println(orderInfo.getOrderName());
		}
		transaction.commit();
	}
	
	/**
	 * 如果客户下面存在订单，是不能删除的，如果非要删除需要手动解除关联关系
	 */
	@Test
	public void testDeleteCustomer(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Customer customer = (Customer)session.get(Customer.class, 4);
		System.out.println(customer.getName());
		
		Set<OrderInfo> orderInfos = customer.getOrderInfos();
		for (OrderInfo orderInfo : orderInfos) {
			orderInfo.setCustomer(null);
		}
		
		session.delete(customer);
		
		transaction.commit();
	}
	
	
}
