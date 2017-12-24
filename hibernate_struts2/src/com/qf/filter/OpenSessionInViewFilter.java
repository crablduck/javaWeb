package com.qf.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.qf.utils.HibernateUtil;

/**
 * Servlet Filter implementation class OpenSessionInFilter
 */
/**
 * 控制session个关闭时间
 * 
 * @author admin
 *
 */
public class OpenSessionInViewFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public OpenSessionInViewFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		// 1.当前线程中创建一个session
		Session session = sessionFactory.getCurrentSession();

		// 2.开启一个事务
		Transaction transaction = session.beginTransaction();

		try {
			// 3.执行业务操作
			chain.doFilter(request, response); //action执行完了+JSP加载完了
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
