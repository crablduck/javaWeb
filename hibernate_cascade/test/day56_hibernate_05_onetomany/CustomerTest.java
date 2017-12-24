package day56_hibernate_05_onetomany;

import static org.junit.Assert.*;

import java.lang.annotation.Target;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.usertype.CompositeUserType;
import org.junit.Test;

import com.qf.entity.Customer;
import com.qf.entity.OrderInfo;
import com.qf.utils.HibernateUtil;

/**
 * save-update 保存一的一方多的一方可以自动保存
 * delete: 删除一的一方同时如果有多的一方也有数据也删除
 * @author admin
 *
 */
public class CustomerTest {

	/**
	 * 级联的添加操作
	 */
	@Test
	public void testAdd() {

		// 创建一的一方
		Customer customer = new Customer();
		customer.setName("李四1");

		// 创建多的一方
		OrderInfo o1 = new OrderInfo();
		o1.setOrderName("订单1");

		OrderInfo o2 = new OrderInfo();
		o2.setOrderName("订单2");

		// 建立关系
		// 让客户知道他有几个订单
		customer.getOrderInfos().add(o1);
		customer.getOrderInfos().add(o2);

		// 因为外键的维护权限在多的一方，所以要建立关系
		o1.setCustomer(customer);
		o2.setCustomer(customer);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		Transaction transaction = session.beginTransaction();

		// 保存一的一方多的一方自动保存
		session.save(customer);

		transaction.commit();

	}

	@Test
	public void testDeleteCustomer() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		Transaction transaction = session.beginTransaction();

		
		Customer customer = (Customer)session.get(Customer.class, 12);
		
		// 手动解除关系可以删除，但是存在垃圾数据
//		Set<OrderInfo> orderInfos = customer.getOrderInfos();
//		for (OrderInfo orderInfo : orderInfos) {
//			orderInfo.setCustomer(null);
//		}
		
		session.delete(customer);
		
		transaction.commit();
	}
	
	
	/**
	 * 测试孤儿删除
	 */
	@Test
	public void testDeleteCustomer1() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		Customer customer = (Customer)session.get(Customer.class, 10);
		
		customer.getOrderInfos().clear(); // 解除了他们之间的关系
		
		transaction.commit();
	}

}
