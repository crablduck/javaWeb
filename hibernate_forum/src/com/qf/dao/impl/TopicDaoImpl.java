package com.qf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.qf.dao.ITopicDao;
import com.qf.entity.Topic;
import com.qf.utils.HibernateUtil;

public class TopicDaoImpl implements ITopicDao {

	@Override
	public int add(Topic t) {
		return 0;
	}

	@Override
	public int update(Topic t) {
		return 0;
	}

	@Override
	public int delete(Integer id) {
		return 0;
	}

	@Override
	public List<Topic> getList(Integer startIndex, Integer pageSize) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("from Topic");
		query.setFirstResult(startIndex);
		query.setMaxResults(pageSize);
		List<Topic> list = query.list();
		return list;
	}

	@Override
	public Topic getById(Integer id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Topic topic = (Topic)session.get(Topic.class, id);
		return topic;
	}

	@Override
	public Integer getCount() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("select count(t) from Topic t");
		Long count = (Long)query.uniqueResult();
		return Integer.parseInt(count.toString());
	}

}
