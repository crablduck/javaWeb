package com.qf.dao.impl;

import java.util.List;

import javax.print.attribute.standard.RequestingUserName;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.qf.dao.IUserDao;
import com.qf.entity.User;
import com.qf.utils.HibernateUtil;

public class UserDaoImpl implements IUserDao {

	@Override
	public int add(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getList(Integer startIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String name, String password) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Query query = session.createQuery("select u from User u where u.name =:name and u.password = :password");
		query.setString("name", name);
		query.setString("password", password);
		return (User) query.uniqueResult();
	}

}
