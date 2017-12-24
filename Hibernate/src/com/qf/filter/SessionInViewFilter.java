package com.qf.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.qf.util.HibernateUtil;

/**
 * Servlet Filter implementation class SessionInViewFilter
 */
public class SessionInViewFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public SessionInViewFilter() {
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
		// TODO Auto-generated method stub
		// place your code here
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		// pass the request along the filter chain
		try {

			chain.doFilter(request, response);
			transaction.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
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
